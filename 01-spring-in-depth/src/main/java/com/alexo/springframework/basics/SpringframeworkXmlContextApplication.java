package com.alexo.springframework.basics;

import com.alexo.springframework.basics.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringframeworkXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkXmlContextApplication.class);


	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext
				= new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Bean loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}",xmlPersonDAO);
			LOGGER.info("{}",xmlPersonDAO.getXmlJdbcConnection());

		}

	}
}
