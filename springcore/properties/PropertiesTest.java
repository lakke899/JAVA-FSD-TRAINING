package com.ust1.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcore/properties/PropertiesConfig.xml");
		CountriesAndLanguages cl=(CountriesAndLanguages) ac.getBean("cAndL");
		System.out.println(cl);// to string method is invoked automatically
		

	}

}