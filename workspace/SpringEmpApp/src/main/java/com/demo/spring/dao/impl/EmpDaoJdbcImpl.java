package com.demo.spring.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@Repository
public class EmpDaoJdbcImpl implements EmpDao {

	@Autowired
	JdbcTemplate jt;

	@Override
	public String saveEmp(Employee e) {
		int count = jt.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con
						.prepareStatement("insert into emp(empno,name,address,salary) " + "values(?,?,?,?)");
				pst.setInt(1, e.getEmpId());
				pst.setString(2, e.getName());
				pst.setString(3, e.getCity());
				pst.setDouble(4, e.getSalary());
				return pst;
			}
		});
		if (count == 1)
			return "Emp Saved";
		return "Emp Not Saved";
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> empList = jt.query("select * from emp", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Employee(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
						rs.getDouble("SALARY"));
			}
		});
		return empList;
	}

	@Override
	public Employee findById(int empid) {
		Employee e = null;
		try {
			e = jt.queryForObject("select * from emp where empno=" + empid, new RowMapper<Employee>() {

				@Override
				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

					return new Employee(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
							rs.getDouble("SALARY"));
				}
			});
		} catch (DataAccessException ex) {
			ex.printStackTrace();
			e = null;
		}
		return e;
	}

	@Override
	@Transactional
	public int saveEmpList(List<Employee> elist) {
		int count = 0;
		for (Employee e : elist) {
			saveEmp(e);
			count++;
		}
		return count;
	}
}
