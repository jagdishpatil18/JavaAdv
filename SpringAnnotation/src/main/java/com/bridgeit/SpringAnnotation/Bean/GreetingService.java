package com.bridgeit.SpringAnnotation.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.SpringAnnotation.lang.Language;

@Service
public class GreetingService {
	
	@Autowired
	private Language language;
	
	public GreetingService()
	{
		
		
	}
	
	public void sayGreeting()
	{
		String greeting=language.getGreetings();
		System.out.println("Greetings: "+greeting);
		
	}
}
