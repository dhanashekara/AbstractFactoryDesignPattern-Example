package com.abstractfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abstractfactory.controller.AbstarctFactoryController;

@SpringBootApplication
public class AbstarctFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstarctFactoryApplication.class, args);
		
		AbstarctFactoryController ab = new AbstarctFactoryController();
		ab.factoryService();
	}

}
