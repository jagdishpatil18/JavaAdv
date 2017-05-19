package com.bridgeit.Tester;

import com.bridgeit.DAO.EmployeeDAO;
import com.bridgeit.DTO.Employee;

public class Tester
{

	public static void main(String[] args)
	{
		EmployeeDAO dao=new EmployeeDAO();
		dao.details();
		//insert employee
		
		Employee employee=new Employee();
	//	employee.setId(101); 
		employee.setFirstname("Jagdish");
		employee.setLastname("Patil");
		employee.setSalary(10000);
		
		Employee employee2=new Employee();
//		employee2.setId(102);
		employee2.setFirstname("abc");
		employee2.setLastname("abc");
		employee2.setSalary(2000);
		
		Employee employee3=new Employee();
//		employee2.setId(102);
		employee3.setFirstname("pqr");
		employee3.setLastname("pqr");
		employee3.setSalary(2000);
		
		Employee employee4=new Employee();
//		employee4.setId(102);
		employee4.setFirstname("Alkesh");
		employee4.setLastname("Mahajan");
		employee4.setSalary(2000);
		
		Integer empid1=dao.addEmployee(employee);
		Integer empid2=dao.addEmployee(employee2);
		Integer empid3=dao.addEmployee(employee3);
		Integer empid4=dao.addEmployee(employee4);
		dao.details();
		System.out.println();
		//Update employee details
		
		Employee emp1=new Employee();
		emp1.setId(empid2);
		emp1.setFirstname("Sagar");
		emp1.setLastname("Patil");
		emp1.setSalary(10000);
		dao.updateemployee(emp1);
		
		dao.details();
		System.out.println();
		//delete employee
		
		Employee emp2=new Employee();
		emp2.setId(empid3);
		dao.deleteemp(emp2);
		
		dao.details();
		System.out.println();
		
		System.out.println(".....................");
		dao.detailsonsal();
	}

}
