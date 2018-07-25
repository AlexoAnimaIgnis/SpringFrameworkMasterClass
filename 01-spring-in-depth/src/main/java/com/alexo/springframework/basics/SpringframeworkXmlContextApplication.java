package com.alexo.springframework.basics;

import com.alexo.springframework.basics.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration //way on defining a configuration without using spring boot
@ComponentScan
public class SpringframeworkXmlContextApplication {

	public static void main(String[] args) {

		// ClassPathXmlApplicationContext - for loading the application context through xml
		// that was defined in applicationContext.xml
		try(ClassPathXmlApplicationContext applicationContext
				= new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());

		}

	}
}
