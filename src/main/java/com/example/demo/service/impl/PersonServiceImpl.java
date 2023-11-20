package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonDao;
import com.example.demo.service.ifs.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao persondao;
	
	@Override
	public void addPerson(Person person) {
		String patternId = "[A-Za-z&&[^ABDEFHabcdefh]][1-2]\\d{8}";
        if (person.getId()!=null&&person.getId().matches(patternId)) {
            persondao.save(person);
        }
//        System.out.println(person.getId()+"Name: "+person.getName()+"age: "+person.getAge()+"City: "+person.getCity());
	}
	
	@Override
    public void addPersonList(List<Person> personList) {
		String pattern="[A-Za-z&&[^ABDEFHabcdefh]][1-2]\\d{8}";
		for(Person item:personList) {
			String id=item.getId();
			if(!StringUtils.hasText(id)|| !id.matches(pattern)) {
				System.out.print("id error!");
				return;
			}
		}
		persondao.saveAll(personList);
    }

}
