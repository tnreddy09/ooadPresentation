package com.spring.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PresentationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context  = SpringApplication.run(PresentationApplication.class, args);
		Car car = context.getBean(Car.class);
		car.start();
		
		car.takeTurn();
		
		car.stop();
//		Car car2 = context.getBean(Car.class);
//		car2.start();
//		
	}

}
