package com.org.example.demo;

import com.org.example.demo.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeSp4McApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BeSp4McApplication.class, args);
		MessageService messageService = context.getBean("messageService", MessageService.class);
		String res = messageService.message();
		System.out.println(res);

	}

}
