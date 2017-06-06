package com.bridgeit.springcore.HelloWorld.configuration;

import org.springframework.context.annotation.Bean;

import com.bridgeit.springcore.HelloWorld.domain.HelloWorld;
import com.bridgeit.springcore.HelloWorld.domain.HelloWorldImpl;

public class HelloWorldConfig {
	@Bean(name="helloworldbean")
	public HelloWorld helloworld(){
		return new HelloWorldImpl();
	}

}
