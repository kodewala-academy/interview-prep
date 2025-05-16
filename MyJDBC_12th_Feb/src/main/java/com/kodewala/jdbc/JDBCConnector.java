package com.kodewala.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnector
{
	public void selectRecords() throws SQLException, ClassNotFoundException
	{
		// Step#1 - Register mysql driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 -  create connection
		String url = "jdbc:mysql://localhost:3306/zepto";
		String userName = "root";
		String password = "Test@12345";

		Connection con = DriverManager.getConnection(url, userName, password);

		// Step#3 -  create statement object
		Statement stmt = con.createStatement();

		String sql = " select count(*) from zepto.orders";

		//Step#4 -  execute query
		ResultSet rs = stmt.executeQuery(sql);


		while (rs.next())
		{
			String orderId = rs.getString(1);
			String itemName = rs.getString(2);
			String status = rs.getString(3);
			String price = rs.getString(4);

			System.out
					.println(" orderId " + orderId + " itemName " + itemName + " status " + status + " price " + price);
		}
	}

}
