package com.alexo.springframework.basics;

import com.alexo.springframework.basics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringframeworkScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkScopeApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringframeworkScopeApplication.class);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
	}
}
