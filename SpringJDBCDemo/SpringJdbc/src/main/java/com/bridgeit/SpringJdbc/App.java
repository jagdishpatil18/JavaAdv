package com.bridgeit.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

         StudentJdbc studentJDBCTemplate = (StudentJdbc) context.getBean("studentJDBC");
         
         System.out.println("------Records Creation--------" );
         studentJDBCTemplate.create("x", 11);
         studentJDBCTemplate.create("y", 2);
         studentJDBCTemplate.create("z", 15);

         System.out.println("------Particular Record by Id--------" );
         Student student = studentJDBCTemplate.getStudent(2);
         System.out.print("ID : " + student.getId() );
         System.out.print(", Name : " + student.getName() );
         System.out.println(", Age : " + student.getAge());
         
         
         System.out.println("------Listing Multiple Records--------" );
         List<Student> students = studentJDBCTemplate.listStudents();
         
         for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
         }
    }
}
