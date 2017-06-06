package com.bridgeit.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgeit.SpringAnnotation.Bean.GreetingService;
import com.bridgeit.SpringAnnotation.Bean.MyComponent;
import com.bridgeit.SpringAnnotation.config.AppConfiguration;
import com.bridgeit.SpringAnnotation.lang.Language;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);
      System.out.println("---------------------------------------");
      Language language= (Language) context.getBean("language");
      
      System.out.println("Bean language : "+language);
      System.out.println("calling language.sayBye :"+ language.getBye());
      
      System.out.println("--------------@service Annotation--------------------------");
     
      GreetingService service=(GreetingService) context.getBean("greetingService");
      service.sayGreeting();
      
      System.out.println("---------------@Component annotation--------------------------");
      MyComponent component=(MyComponent) context.getBean("myComponent");
      component.showAppInfo();
    }
}
