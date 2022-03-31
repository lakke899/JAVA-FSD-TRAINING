package com.ust1.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("com/ust1/spring/springcore/map/MapConfig.xml");
		Customer c = (Customer) a.getBean("customer");
		System.out.println(c);// toString() method is automatically invoked
		//System.out.println("Brands:"+cd.getProducts());
	}

}
