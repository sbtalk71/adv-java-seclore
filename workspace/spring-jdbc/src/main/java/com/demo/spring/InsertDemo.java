package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class InsertDemo {

	public static void main(String[] args) {
		
		final String INSERT_SQL="insert into emp(empno,name,address,salary) values(?,?,?,?)";
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		JdbcTemplate jt=ctx.getBean(JdbcTemplate.class);
		
		int rowCount=jt.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst=con.prepareStatement(INSERT_SQL);
				pst.setInt(1, 200);
				pst.setString(2, "Mohan");
				pst.setString(3, "Chennai");
				pst.setDouble(4, 67000);
				return pst;
			}
		});
		
		
		
		//also implement select One Row and select multiple rows
		//For Select Use RowMapper callback interface
		
		

	}

}
