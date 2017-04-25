package service;

import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;



public class jdbcsavepoint 
{
	 public static void main(String args[])
	 {
		
	     Connection connection=null;
		 Statement statement=null;
		 Savepoint savepoint=null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				System.out.println("Connecting");
				
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgeit","root","root");
				System.out.println("connected");
				connection.setAutoCommit(false);
				PreparedStatement ps=(PreparedStatement) connection.prepareStatement("update employee set name='JAck' where id=5");
				ps.executeUpdate();
				savepoint=connection.setSavepoint();
				
				PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("insert into employee values (id=111,name='JAckkkk', age=24)");
				preparedStatement.executeUpdate();
				connection.commit();
				
			} catch (SQLException e) {
				try {
					connection.rollback(savepoint);
					connection.commit();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 } 
		
	 }

