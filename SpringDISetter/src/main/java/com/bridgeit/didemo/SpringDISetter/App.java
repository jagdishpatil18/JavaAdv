package com.bridgeit.didemo.SpringDISetter;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Helper helper=(Helper) context.getBean("Helper");
        helper.communicate();
        
    }
}
