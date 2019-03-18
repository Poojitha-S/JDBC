package com.bridgeit.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class CreateTable 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/EmpDatabase";
		String userName = "admin";
		String passwd = "admin123";
		String query = "create table Employee(Empid int(3),Empname varchar(20) "+",Emppost varchar(20))";
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection  = DriverManager.getConnection(url, userName, passwd);
			PreparedStatement statement = connection.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("created ");
			statement.close();
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

