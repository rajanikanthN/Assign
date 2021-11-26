package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repo;
	public int getCount() {
		return repo.getCountOfUsers();
	}
	public Object getById(int id) {
		return repo.getById(id);
	}

	public Person getByName(String name) {
		return repo.getName(name);
	}
	public void addNewPerson(Person thPerson) {
		repo.addPer(thPerson);
		
	}
	public void updatePerson(Person thePerson) {
		repo.updatePerson(thePerson);
		
	}
	public void deletePerson(int id) {
		repo.deletePerson(id);
	}
	public List<Person> getAll() {
		return repo.getAll();
	}

}
