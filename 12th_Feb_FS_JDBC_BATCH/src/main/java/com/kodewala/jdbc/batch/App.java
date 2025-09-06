package com.kodewala.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{

		// Step#1 - Register mysql driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 - create connection
		String url = "jdbc:mysql://localhost:3306/zepto";
		String userName = "root";
		String password = "Test@12345";

		Connection con = DriverManager.getConnection(url, userName, password);

		String insertSql = "insert into orders (order_id, item_name, order_status, price) values (?, ?,?,?)";
		// Step#3 - create prepared statement object
		PreparedStatement pstmt = con.prepareStatement(insertSql);

		for (int i = 1; i < 2300; i++) // Receiving records from files / xls
		{

			pstmt.setString(1, "105" + i);
			pstmt.setString(2, "MSI Laptop" + i);
			pstmt.setString(3, "Delivered" + i);
			pstmt.setString(4, "60000" + i);
			pstmt.addBatch();
			
			if (i % 1000 == 0)
			{
				System.out.println(" Executing batch of 1000...");
				pstmt.executeBatch(); // execute batch of 1000
			}

		}
		// execute the remaining
		System.out.println(" Executing remaining records...");
		pstmt.executeBatch();

	}
}
