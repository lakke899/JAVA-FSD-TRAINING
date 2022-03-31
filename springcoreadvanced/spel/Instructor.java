package com.ust1.spring.springcoreadvanced.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("ins")
public class Instructor {
	// we can specify the value/ name of the object to be created within curly
	// braces in the component annotation, then the camel case object wont be
	// created.
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	int id;
	@Value("#{'Ronin'.toLowerCase()}")
	String name;
	@Value("#{topics}")
	private List<String> topics;

	@Value("#{4+5>11?false:true}")
	private boolean value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", value=" + value + "]";
	}

}
