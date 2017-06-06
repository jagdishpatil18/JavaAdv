package com.bridgeit.SpringHibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.SpringHibernate.DAO.PersonDao;
import com.bridgeit.SpringHibernate.DTO.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring N Hibernate !!!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        PersonDao personDao= (PersonDao) context.getBean("personDAO");
    
        Person person=new Person();
 //       person.setId(1);
        person.setName("XYZ");
        person.setCountry("INDIA");
        
        personDao.save(person);
        System.out.println("Person:"+person);	
        
        
        List<Person> list = personDao.list();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		
    }
}


