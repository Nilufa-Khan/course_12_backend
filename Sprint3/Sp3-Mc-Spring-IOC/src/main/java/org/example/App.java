package org.example;

import org.example.config.AppConfig;
import org.example.domain.Employee;
import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean("emp", Employee.class);
        System.out.println(employee);

        System.out.println("---------------------------");

        Employee employee2 = context.getBean("emp2", Employee.class);
        System.out.println(employee2);
    }
}
