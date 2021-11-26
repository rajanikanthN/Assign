package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerController {
	
	@Autowired
	LearnerService theService;
	
	@GetMapping("learn")
	Iterable<Learner> getAllLearners() {
		return theService.getAllLearners();
		
	}
	@GetMapping("learn/{id}")
	Optional<Learner> getById(@PathVariable int id) {
		return theService.getById(id);
	}
	@GetMapping("learn/name/{name}")
	List<Learner> findByName(@PathVariable String name) {
		return theService.findByName(name);
	}
	@GetMapping("learn/domain/{domine}")
	List<Learner> findByDomain(@PathVariable String domine) {
		return theService.findByDomain(domine);
	}
	
	
	@PostMapping("learn")
	void addNew(@RequestBody Learner theLearner) {
		theService.addNew(theLearner);
	}
	@PutMapping("learn/{id}")
	void updateOne(@PathVariable int id, @RequestBody Learner theLearner) {
		theService.updateOne(theLearner);
	}
	@DeleteMapping("learn/{id}")
	void deleteLearner(@PathVariable int id) {
		theService.deleteLearner(id);
	}

}
