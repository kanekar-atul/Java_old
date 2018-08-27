package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jdbccore?useSSL=false";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "pass123";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			conn.setAutoCommit(false);
			Statement stmt1 = conn.createStatement();

			String SQL = "INSERT INTO Employees  " + "VALUES (103, 20, 'Rita-3', 'Tez-3')";
			stmt1.executeUpdate(SQL);
			// Submit a malformed SQL statement that breaks
			String SQL1 = "INSERTED IN Employees  " + "VALUES (104, 22, 'Sita', 'Singh')";
			stmt.executeUpdate(SQL1);
			// If there is no error.
			conn.commit();

			conn.close();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample
