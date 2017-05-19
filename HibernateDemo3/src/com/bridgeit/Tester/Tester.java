package com.bridgeit.Tester;

import com.bridgeit.DAO.ContactDAO;
import com.bridgeit.DTO.Contact;

public class Tester 
{

	public static void main(String[] args)
	{
	
//		Contact contact1=new Contact(101,"Abc","abc@gmail.com","town","1234567890");
		
//		Contact contact2=new Contact(102,"JAck", "jack@gmail.com", "dhule", "123456790");

		Contact contact3=new Contact();
		contact3.setId(101);
		contact3.setName("Alkesh");
		contact3.setEmail("alkesh@gmail.com");
		contact3.setAddress("Dhule");
		contact3.setTelephone("1234567899");
		
		ContactDAO contactDAO=new ContactDAO();
//		contactDAO.insertdata(contact1);
//		contactDAO.insertdata(contact2);
//		contactDAO.insertdata(contact3);
		
	contactDAO.updatedata(contact3);	
		System.out.println("Successful");
	
		
	}

	
}
