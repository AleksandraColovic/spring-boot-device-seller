package com.sha.springbootjwtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active::default}.properties")
public class SpringBootJwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtDemoApplication.class, args);
	}

}
