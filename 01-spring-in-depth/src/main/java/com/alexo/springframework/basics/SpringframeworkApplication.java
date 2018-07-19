package com.alexo.springframework.basics;

import com.alexo.springframework.basics.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringframeworkApplication {

	//what are the beans?
	//what are the dependencies of a bean?
	//where to search for beans? => no need as springbootapplication annotation uses the package of the class
	//spring starts with @ComponentScan

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		// ApplicationContext will managed all the bean
		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

		System.out.println(result);

	}
}
