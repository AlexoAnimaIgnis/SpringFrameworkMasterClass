package com.alexo.springframework.basics;

import com.alexo.springframework.cdi.SomeCdiBusiness;
import com.alexo.springframework.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication // default behavior for this is do a scan on the package it is located
@ComponentScan("com.alexo.springframework.cdi")
public class SpringframeworkCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkCdiApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkCdiApplication.class, args);
		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDAO());
	}
}
