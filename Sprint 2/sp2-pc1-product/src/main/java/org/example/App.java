package org.example;

import org.example.config.AppConfig;
import org.example.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //to access the bean declared
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        Product res = con.getBean("user1", Product.class);
        System.out.println(res);
        //res2 is a reference of Product type
        Product res2 = con.getBean("user2", Product.class);
        System.out.println(res2);
    }
}
