package com.bridgeit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SelectQuery
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/EmpDatabase";
		String userName = "admin";
		String passwd = "admin123";
		String query = "select * from Employee";
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, passwd);
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(query);
			System.out.println();
			while(set.next())
			{
				System.out.println(set.getInt(1)+" : "+set.getString(2)+" : "+set.getString(3));
			}
			statement.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

