package com.bridgeit.SpringHinernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.SpringHinernate.Model.Stock;
import com.bridgeit.SpringHinernate.stock.StockBo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("BeansLocation.xml");
     
       /* 	Also it can work
        ApplicationContext context=new ClassPathXmlApplicationContext("example.xml");*/
        
        StockBo stockBo=(StockBo) context.getBean("stockBo");
        
        Stock stock = new Stock();
    	stock.setStockCode("3256");
    	stock.setStockName("HDFC");
    	stockBo.save(stock);
    	System.out.println("Done");
    }
}
