package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	PersonService service;
	
// Get count
	@RequestMapping("count")
	int getCount() {
		return service.getCount();
	}
	
// Get by Id
	@RequestMapping("p/{id}")
	Object getById(@PathVariable int id) {
		return service.getById(id);
	}
	
// Get Name By Name
	@RequestMapping ("pr/{name}")
	Person getByName(@PathVariable String name) {
		return service.getByName(name);
	}
// Adding a new Person	
	@PostMapping("person")
	void addNewPerson(@RequestBody Person thPerson) {
		service.addNewPerson(thPerson);
	}
// Update a Existing Person
	@PutMapping("person")
	void updatePerson(@RequestBody Person thePerson) {
		service.updatePerson(thePerson);
	}
// Delete a person 
	@DeleteMapping("p/{id}")
	void deletePerson(@PathVariable int id) {
		service.deletePerson(id);
	}
	
// Get all Persons Detail
	@RequestMapping("all")
	List<Person> getAll() {
		return service.getAll();
	}
	
	

}
