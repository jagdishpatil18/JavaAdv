package com.myjar.DTO;

import java.io.Serializable;

public class Student implements Serializable
{

	private int rollno;
	private String name;
	
	public int getRollno()
	{
		return rollno;
	}
	
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}
