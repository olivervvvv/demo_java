package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonDao;
import com.example.demo.service.ifs.PersonService;


@SpringBootTest
public class PersonServiceTest {

	@Autowired
	private PersonService personService;
	@Autowired
	private PersonDao personDao;
	
	@Test
	public void addPersonTest() {
		personService.addPerson(new Person("L133333333","waill", 27, "Tainan"));
		personService.addPerson(new Person("L123456789","JOSH", 30, "Tainan"));
		personService.addPerson(new Person("L223456789","mesi", 30, "Tainan"));
		personService.addPerson(new Person("L124656789","James", 30, "Tainan"));
		personService.addPerson(new Person("L122256789","Faker", 27, "Tainan"));
		personService.addPerson(new Person("L124622789","Guma", 18, "Tainan"));
		personService.addPerson(new Person("L124604789","yuri", 20, "Taipai"));

	}
	@Test
	public void addSaveAllTest() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("A123456789","DDD",22,"Taichung"));
		list.add(new Person("A123323339","AAA",25,"Taichung"));
		personDao.saveAll(list);
		
	}
	@Test
	public void daoFindTest() {
		
		Optional<Person> infoOp = personDao.findById("A123323339");
		if(infoOp.isEmpty()) {
			System.out.println("Not found");
		}
		else {
			System.out.print(infoOp.get().getName());
		}
	}
	@Test
	public void daoFindTest2() {
		List<Person> list = personDao.findAll();
		for(Person item:list) {
			System.out.println("Id: "+item.getId()+" Name: "+item.getName()+" age: "+item.getAge()+" City: "+item.getCity());
		}
	}
	@Test
	public void daoFindTest3() {
		List<Person> result = personDao.findByCity("Tainan");
		List<Person> result1 = personDao.findByCityOrId("Tainan","L123456789");
		for(Person item:result) {			
			System.out.println(item.getName());
		}
	}
	
	@Test
	public void findByIdTest() {
		/* id�s�b */
		Optional<Person> op = personDao.findById("C222222222");
		System.out.println(op.get().getName());
		/* id���s�b(����) */
		Optional<Person> op2 = personDao.findById("C122222222");
		System.out.println(op2.get().getName());
	}

	@Test
	public void findByAgeGreaterThanTest() {
		List<Person> Person = personDao.findByAgeGreaterThan(15);
		
		System.out.println("�`�@" + Person.size() + "�����");
		for (Person item : Person) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}

	@Test
	public void findByAgeLessThanEqualOrderByTest() {
		List<Person> Person = personDao.findByAgeLessThanEqualOrderByAge(30);
		
		System.out.println("�`�@" + Person.size() + "�����");
		for (Person item : Person) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}

	@Test
	public void findByAgeLessThanOrAgeGreaterThanTest() {
		List<Person> Person = personDao.findByAgeLessThanOrAgeGreaterThan(15, 40);
		
		System.out.println("�`�@" + Person.size() + "�����");
		for (Person item : Person) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}
	
	@Test
	public void findTop3ByAgeBetweenOrderByAgeDescTest() {
		List<Person> Person = personDao.findTop3ByAgeBetweenOrderByAgeDesc(15, 40);
		
		System.out.println("�`�@" + Person.size() + "�����");
		for (Person item : Person) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}
	
	@Test
	public void findByAgeGreaterThanOrderByAgeDescAndCityContaining() {
		List<Person> Person = personDao.findByAgeGreaterThanAndCityContainingOrderByAgeDesc(18,"Taipei");
		
		System.out.println("�`�@" + Person.size() + "�����");
		for (Person item : Person) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}
	
	@Test
	public void findByCityContainingTest() {
		List<Person> Person = personDao.findByCityContaining("t");
		
		System.out.println("�`�@" + Person.size() + "�����");
		for (Person item : Person) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}
	
	

	@Test
	public void findByCityTest() {

		List<Person> InfoList = personDao.findByCity("�W��");
		for (Person item : InfoList) {
			System.out.printf("�ڬO%s�A%s�H\n", item.getName(), item.getCity());
		}

	}

	@Test
	public void findByNameAndCityTest() {

		List<Person> InfoList = personDao.findByNameAndCity("meme", "�W��");
		for (Person item : InfoList) {
			System.out.printf("�ڬO%s�A%s�H\n", item.getName(), item.getCity());
		}

	}

	@Test
	public void findByNameOrCityTest() {

		List<Person> InfoList = personDao.findByNameOrCity("jack", "�W��");
		for (Person item : InfoList) {
			System.out.printf("�ڬO%s�A%s�H\n", item.getName(), item.getCity());
		}

	}


	@Test
	public void daofindAllTest() {
		List<Person> list = personDao.findAll();
		for (Person item : list) {
			System.out.printf("�ڬO%s�A%s�H\n", item.getName(), item.getCity());
		}
	}

	@Test
	public void daoTest() {
		// �M����wPK��ƬO�_�s�b(return boolean)
		/* �q�`�Ψӧ�b���O�_�Q���U */
		boolean result = personDao.existsById("C123456789");
		System.out.println(result);
	}
	
//	@Test
//	public void daofindTest() {
//		/* Optional<��ƫ��A> �A�u��findById�o�Ӥ�k�|��Optional�˰_�� */
//		Optional<Person> infoOp = PersonDao.findById("C222222222");
//		// isPresent()�PisEmpty()�ۤ�
//		if (infoOp.isEmpty()) {
//			System.out.println("�䤣����w���");
//			return;
//		}
//		/* Optional�n�ϥ�.get()���X�s��<>��� */
//		System.out.println("name = " + infoOp.get().getName());
//
//	}
}
