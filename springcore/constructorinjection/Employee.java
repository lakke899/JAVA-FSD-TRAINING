package com.ust1.spring.springcore.constructorinjection;

public class Employee {
	public Employee(int id, Address address) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private int id;
	private Address address;

}
