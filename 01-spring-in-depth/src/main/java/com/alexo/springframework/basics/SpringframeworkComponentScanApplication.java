package com.alexo.springframework.basics;

import com.alexo.springframework.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication // default behavior for this is do a scan on the package it is located
@Configuration
@ComponentScan("com.alexo.springframework.componentscan")
public class SpringframeworkComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringframeworkComponentScanApplication.class);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
	}
}
