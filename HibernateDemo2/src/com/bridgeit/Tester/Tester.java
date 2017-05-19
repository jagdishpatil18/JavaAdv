package com.bridgeit.Tester;

import com.bridgeit.DAO.EmployeeDao;
import com.bridgeit.DTO.EmployeeDto;

public class Tester {

	public static void main(String[] args)
	{
	
			EmployeeDto employee=new EmployeeDto();
			employee.setId(202);
			employee.setFirstname("Sagar");
			employee.setLastname("Patil");
			
			EmployeeDao dao=new EmployeeDao();
			dao.save(employee);
			
			System.out.println("Successfully added");
	}

}
