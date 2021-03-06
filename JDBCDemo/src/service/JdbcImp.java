package service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class JdbcImp
{
	
	public static void main(String[] args) throws SQLException 
	{
		  Scanner scanner=new Scanner(System.in);
		  Connection connection=null;
		
		System.out.println("Getting connected");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
	        System.out.println("Connected");
	        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgeit","root","root");
			
			System.out.println("Data is :");
		    connection.setAutoCommit(false);
		  
		    
		    System.out.println("Updating");	
			PreparedStatement ps=(PreparedStatement) connection.prepareStatement("update employee set name=? where id=?");
			System.out.println("Enter Id where you want to update");
			int id1=scanner.nextInt();
			System.out.println("Enter the new Name");
			String name1=scanner.next();

			ps.setString(1,name1);
			ps.setInt(2, id1);
			ps.executeUpdate();
			
		    
			PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("insert into employee values(?,?,?)");
			
			System.out.println("Insert data");
			System.out.println("Enter Id");
			int id=scanner.nextInt();
			System.out.println("Enter the Name");
			String name=scanner.next();
			System.out.println("Enter age");
			int age=scanner.nextInt();
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.executeUpdate();
			connection.commit();
			
			
			String Name;
			int Id,Age;	
			ResultSet resultset=preparedStatement.executeQuery("Select * from employee");
			while(resultset.next())
			{
				Id=resultset.getInt(1);
				Name=resultset.getString(2);
				Age=resultset.getInt(3);
				System.out.println(Id+"  "+Name+"  "+Age);
			}	
			
			 
		}
		catch (ClassNotFoundException e)
		{
			connection.rollback();		
			e.printStackTrace();
		} catch (SQLException e) {
			
			connection.close(); 
			e.printStackTrace();
		}
	}
	
}
