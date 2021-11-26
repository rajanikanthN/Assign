package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerRepository extends CrudRepository<Learner, Integer>{

	List<Learner> findByName(String name);

	List<Learner> findByDomain(String domine);
	
//	@Query(value = "select * from learner where name = (select name from users)", nativeQuery = true)
//	List<Learner> SearchLearners();

}
