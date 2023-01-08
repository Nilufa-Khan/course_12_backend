package org.example.config;

import org.example.domain.Product;
import org.springframework.context.annotation.Bean;


public class AppConfig {

    @Bean("user1")
    public Product getUser1(){
        return  new Product(100,"Mobile","Black");
    }
    @Bean("user2")
    public Product getUser2(){
        return  new Product(190,"Laptop","Grey");
    }
}
