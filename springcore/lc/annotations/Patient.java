package com.ust1.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside the setter method");
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		System.out.println("inside hi() method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("inside bye() method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
