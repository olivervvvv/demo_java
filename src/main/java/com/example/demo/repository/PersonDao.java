package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,String>{

	public List<Person> findByCity(String city);
	public List<Person> findByCityAndName(String city ,String name);
	public List<Person> findByCityOrId(String city,String id);
	
	
	public Optional<Person> findById(String id);

	public List<Person> findByAgeGreaterThan(int age);

	public List<Person> findByAgeLessThanEqualOrderByAge(int age);

	public List<Person> findByAgeLessThanOrAgeGreaterThan(int age, int age2);

	public List<Person> findTop3ByAgeBetweenOrderByAgeDesc(int min, int max);
	
	public List<Person> findByCityContaining(String city);
	
	public List<Person> findByNameAndCity(String name,String city);
	
	public List<Person> findByNameOrCity(String name,String city);

	public List<Person> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String city);
}
