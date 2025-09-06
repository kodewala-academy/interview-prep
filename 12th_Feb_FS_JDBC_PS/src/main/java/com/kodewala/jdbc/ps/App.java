package com.kodewala.jdbc.ps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

		// Step#1 - Register mysql driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 -  create connection
		String url = "jdbc:mysql://localhost:3306/zepto";
		String userName = "root";
		String password = "Test@12345";

		Connection con = DriverManager.getConnection(url, userName, password);

		String sql = "select * from orders where order_id = ? "; 
		// Step#3 -  create prepared statement object
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, "102"); // -->  select * from orders where order_id=102;
		
		//Step#4 -  execute query
		ResultSet rs = pstmt.executeQuery();


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
