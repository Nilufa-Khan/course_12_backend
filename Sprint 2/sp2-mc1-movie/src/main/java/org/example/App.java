package org.example;

import org.example.config.MovieConfig;
import org.example.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(MovieConfig.class);

        Movie movieDetails1 = con.getBean("movie1", Movie.class);
        Movie movieDetails2 = con.getBean("movie2", Movie.class);
        Movie movieDetails3 = con.getBean("movie3", Movie.class);
        Movie movieDetails4 = con.getBean("movie4", Movie.class);
        System.out.println(movieDetails1);
        System.out.println(movieDetails2);
        System.out.println(movieDetails3);
        System.out.println(movieDetails4);
    }
}
