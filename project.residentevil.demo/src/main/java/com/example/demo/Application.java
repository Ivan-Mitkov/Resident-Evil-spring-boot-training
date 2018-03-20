package com.example.demo;

import java.time.LocalDate;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	 @PostConstruct
	    public void init(){
	        TimeZone.getDefault();   // It will set UTC timezone
	        System.out.println("Spring boot application running in" + TimeZone.getDefault() +" timezone :" +LocalDate.now());   // It will print UTC timezone
	    }
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
