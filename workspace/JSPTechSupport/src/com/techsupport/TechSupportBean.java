package com.techsupport;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TechSupportBean {

	private String email;
	private String software;
	private String os;
	private String problem;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	private boolean registered = false;

	public TechSupportBean() {
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getSoftware() {
		return software;
	}

	public String getOs() {
		return os;
	}

	public String getProblem() {
		return problem;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void registerSupportRequest() throws SQLException {

		int requestId = 0;
		Connection connection = null;
		String insertStatementStr = "INSERT INTO SUPP_REQUESTS VALUES(?, ?, ?, ?, ?)";
		String selectCustomerStr = "SELECT CUSTOMERS.FNAME, CUSTOMERS.LNAME, CUSTOMERS.PHONE FROM CUSTOMERS "
				+ "WHERE CUSTOMERS.EMAIL = ?";

		PreparedStatement insertStatement = null;
		PreparedStatement selectStatement = null;

		try {
			connection = getConnection();

			insertStatement = connection.prepareStatement(insertStatementStr);
			requestId = getNextNumber();

			insertStatement.setInt(1, requestId);
			insertStatement.setString(2, email);
			insertStatement.setString(3, software);
			insertStatement.setString(4, os);
			insertStatement.setString(5, problem);

			System.out.println("data Set...");
			insertStatement.executeUpdate();

			// Now verify if the customer is registered or not.
			selectStatement = connection.prepareStatement(selectCustomerStr);
			selectStatement.setString(1, email);

			ResultSet rs = selectStatement.executeQuery();
			System.out.println(rs);
			if (rs.next()) {
				setFirstName(rs.getString("FNAME"));
				setLastName(rs.getString("LNAME"));
				setPhoneNumber(rs.getString("PHONE"));

				// The customer was registered - we can go straight to the
				// response page
				registered = true;
			} else {
				registered = false;
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (Exception e) {
				}
		}
	}

	public void registerCustomer() throws Exception {
		Connection connection = null;
		PreparedStatement insertStatement = null;
		String insertStatementStr = "INSERT INTO CUSTOMERS VALUES(?, ?, ?, ?)";
		try {
			connection = getConnection();

			insertStatement = connection.prepareStatement(insertStatementStr);
			insertStatement.setString(1, email);
			insertStatement.setString(2, firstName);
			insertStatement.setString(3, lastName);
			insertStatement.setString(4, phoneNumber);

			insertStatement.executeUpdate();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}

	private Connection getConnection1() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

		} catch (ClassNotFoundException cnf) {
			System.out.println("The driver class not found in the class path");
		}
		return conn;
	}

	// ***************************************
	private Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		Context ctx1=(Context)ctx.lookup("java:/comp/env");
		DataSource ds=(DataSource)ctx1.lookup("jdbc/ds");
	return ds.getConnection();
	}
	// **************************************
	// GET THE NEXT REQUEST ID FROM SEQ_NO TABLE

	private int getNextNumber() throws Exception {

		String updateStatementStr = "UPDATE SEQ_NO SET NEXT_NO = NEXT_NO + 1";
		String selectStatementStr1 = "SELECT NEXT_NO FROM SEQ_NO";
		Connection connection = getConnection();

		PreparedStatement updateStatement = connection.prepareStatement(updateStatementStr);
		PreparedStatement selectStatement = connection.prepareStatement(selectStatementStr1);

		connection.setAutoCommit(false);

		// Increment the sequencer
		updateStatement.executeUpdate();

		// Retrieve the sequencer number
		ResultSet rs = selectStatement.executeQuery();
		rs.next();
		int next = rs.getInt(1);

		rs.close();
		updateStatement.close();
		selectStatement.close();

		connection.commit();
		connection.close();

		return next;
	}

}
