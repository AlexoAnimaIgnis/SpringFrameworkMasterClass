package com.alexo.springframework.basics;

import com.alexo.springframework.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication // default behavior for this is do a scan on the package it is located
@ComponentScan("com.alexo.springframework.componentscan")
public class SpringframeworkComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
	}
}
