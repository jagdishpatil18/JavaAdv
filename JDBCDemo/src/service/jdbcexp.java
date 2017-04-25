package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class jdbcexp 
{
	public static void main(String[] args) throws SQLException 
	{
	
		try 
		{
			System.out.println("Getting connected");
			Class.forName("com.mysql.jdbc.Driver");
	
			System.out.println("Connected");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgeit","root","root");
			Statement statement=connection.createStatement();  
			System.out.println("Data is :");
			Scanner scanner=new Scanner(System.in);

			String Name;
			int Id,Age;
	
			System.out.println("Updating");	
			PreparedStatement ps=(PreparedStatement) connection.prepareStatement("update emp set name=? where id=?");

			ps.setString(1,"abc");
			ps.setInt(2, 11121);
			ps.addBatch();
			
			ps.setString(1,"kbc");
			ps.setInt(2, 11122);
			ps.addBatch();
			
			ps.executeBatch();
			
			ResultSet resultset=ps.executeQuery("Select * from emp");
			while(resultset.next())
			{
				Id=resultset.getInt(1);
				Name=resultset.getString(2);
				Age=resultset.getInt(3);
				System.out.println(Id+"  "+Name+"  "+Age);
			}	
			
			connection.close();  
		}
		catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
