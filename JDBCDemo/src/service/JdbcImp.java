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
	
		try 
		{
			System.out.println("Getting connected");
			Class.forName("com.mysql.jdbc.Driver");
	
			System.out.println("Connected");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgeit","root","root");
			Statement statement=connection.createStatement();  
			System.out.println("Data is :");
//			ResultSet rs=statement.executeQuery("select * from emp");
//			while(rs.next())  
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//			ResultSet resultset=statement.executeQuery("select id,name from emp where name like'J%'  ");
//			while(resultset.next())  
//     		System.out.println(resultset.getInt(1)+"  "+resultset.getString(2)+"");  
			
			PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("insert into emp values(?,?,?)");
			Scanner scanner=new Scanner(System.in);
			
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
			
			
			
			String Name;
			int Id,Age;
			ResultSet resultSet=preparedStatement.executeQuery("Select * from emp");
			while(resultSet.next())
			{
				Id=resultSet.getInt(1);
				Name=resultSet.getString(2);
				Age=resultSet.getInt(3);
				System.out.println(Id+"  "+Name+"  "+Age);
			}	
			System.out.println("Updating");	
			PreparedStatement ps=(PreparedStatement) connection.prepareStatement("update emp set name=? where id=?");
			System.out.println("Enter Id where you want to update");
			int id1=scanner.nextInt();
			System.out.println("Enter the new Name");
			String name1=scanner.next();

			ps.setString(1,name1);
			ps.setInt(2, id1);
			ps.executeUpdate();
			
			ResultSet resultset=preparedStatement.executeQuery("Select * from emp");
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
