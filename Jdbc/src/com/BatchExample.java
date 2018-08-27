package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jdbccore";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "pass123";

	public static void main(String[] args) {
		Connection conn = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Create statement object
			Statement stmt = conn.createStatement();

			// Set auto-commit to false
			conn.setAutoCommit(false);

			// Create SQL statement
			String SQL = "INSERT INTO Employees (id, first, last, age) " + "VALUES(200,'Zia', 'Ali', 30)";
			// Add above SQL statement in the batch.
			stmt.addBatch(SQL);

			// Create one more SQL statement
			String SQL1 = "INSERT INTO Employees (id, first, last, age) " + "VALUES(201,'Raj', 'Kumar', 35)";
			// Add above SQL statement in the batch.
			stmt.addBatch(SQL1);

			// Create one more SQL statement
			String SQL2 = "UPDATE Employees SET age = 35 " + "WHERE id = 100";
			// Add above SQL statement in the batch.
			stmt.addBatch(SQL2);

			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			// Explicitly commit statements to apply changes
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
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end JDBCExample
