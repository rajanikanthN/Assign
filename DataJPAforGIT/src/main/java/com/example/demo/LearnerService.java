package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class LearnerService {
	
	
	@Autowired
	LearnerRepository repo;
	
	Iterable<Learner> getAllLearners(){
	return repo.findAll();
	}
	
	Optional<Learner> getById(int id) {
		return repo.findById(id);
	}
	public List<Learner> findByName(String name) {
		return repo.findByName(name);
	}
	public List<Learner> findByDomain(String domine) {
		return repo.findByDomain(domine);
	}

	
	void addNew(Learner theLearner) {
		 repo.save(theLearner);
		
	}
	void updateOne(Learner theLearner) {
		repo.save(theLearner);
	}
	
	void deleteLearner(int id) {
		repo.deleteById(id);
	}

	

	
}
