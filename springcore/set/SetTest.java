package com.ust1.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcore/set/SetConfig.xml");
		CarDealer cd = (CarDealer) ac.getBean("carDealer");
		System.out.println("Car Dealer Name : "+cd.getName());
		System.out.println("Brands : "+cd.getBrands());
	}

}
