package com.kodewala.jdbc;

import java.sql.SQLException;

/**
 * JDBC 
 *
 */
public class MyFirstJDBC
{
	public static void main(String[] args)
	{
		JDBCConnector connector = new JDBCConnector();

		try
		{
			connector.selectRecords();

		} catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
