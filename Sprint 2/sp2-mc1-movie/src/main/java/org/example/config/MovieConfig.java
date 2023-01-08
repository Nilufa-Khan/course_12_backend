package org.example.config;

import org.example.domain.Movie;
import org.springframework.context.annotation.Bean;

public class MovieConfig {


    @Bean("movie1")
    public Movie getMovieData1(){
    return  new Movie(12,"Kabhi Khusi Kabhi Gham","Romance","12/02/2001");
    }

    @Bean("movie2")
    public Movie getMovieData2(){
        return  new Movie(19,"kuch kuch hota hai","Romance","22/03/1998");
    }

    @Bean("movie3")
    public Movie getMovieData3(){
        return  new Movie(17,"kal ho naa ho","Romance","19/05/2003");
    }

    @Bean("movie4")
    public Movie getMovieData4(){
        return  new Movie(15,"om shanti om","Romance","01/12/2007");
    }

}
