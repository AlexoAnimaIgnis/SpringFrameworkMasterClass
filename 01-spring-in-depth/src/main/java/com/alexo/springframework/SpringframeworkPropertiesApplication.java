package com.alexo.springframework;

import com.alexo.springframework.basics.basic.BinarySearchImpl;
import com.alexo.springframework.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringframeworkPropertiesApplication {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(SpringframeworkPropertiesApplication.class)) { // usual way of creating a new application context
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			System.out.println(someExternalService.returnServiceUrl());
		}

	}
}
