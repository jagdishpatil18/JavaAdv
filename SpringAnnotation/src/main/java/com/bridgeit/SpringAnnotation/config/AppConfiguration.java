package com.bridgeit.SpringAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bridgeit.SpringAnnotation.lang.Language;
import com.bridgeit.SpringAnnotation.lang.Impl.English;

@Configuration
@ComponentScan({"com.bridgeit.SpringAnnotation.Bean"})
public class AppConfiguration {
	
	@Bean(name="language")
	public Language getLanguage(){
		
		return new English();
	}
}
