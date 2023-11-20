package com.example.demo.service.ifs;

import java.util.List;

import com.example.demo.entity.Person;

public interface PersonService {
	
	public void addPerson(Person person);
	
	public void addPersonList(List<Person> personList);
}
