package com.bridgelabz.loginapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Login 
{
	Connection connection=null;
	public Login()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Getting connected");

			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgeit","root","bridgeit");
			System.out.println("connected");
	//		PreparedStatement preparedStatement=connection.prepareStatement("insert into users values(?,?,?,?,?)");
			
	
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
	public	Connection getconnect()
	{
		return connection; 
	}
}
