package com.ust1.spring.springcoreadvanced.stereotype.annotations.valuewithcollections;

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
	@Value("22")
	int id;
	@Value("kate bishop")
	String Name;
	@Value("#{topics}")
	private List<String> topics;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", Name=" + Name + ", topics=" + topics + "]";
	}
}
