package com.bridgeit.didemo.DependancyInjectionDemo1;

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
        /*System.out.println( "Hello World!" );*/
    	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         Communication app = (Communication)context.getBean("OutputHelper");
         app.getDisplay();
    	
    }
}
