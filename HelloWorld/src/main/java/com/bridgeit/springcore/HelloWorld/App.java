package com.bridgeit.springcore.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bridgeit.springcore.HelloWorld.configuration.HelloWorldConfig;
import com.bridgeit.springcore.HelloWorld.domain.HelloWorld;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "main method!" );
    
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
       HelloWorld bean=(HelloWorld) context.getBean("helloworldbean");
       bean.sayHello(" , This is my first spring demo");
       context.close();
    }
}
