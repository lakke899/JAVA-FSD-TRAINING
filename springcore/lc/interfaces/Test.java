package com.ust1.spring.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcore/lc/interfaces/interfacesconfig.xml");
		Patient p = (Patient) ac.getBean("patient");
		System.out.println(p);
		ac.registerShutdownHook();
	}

}
