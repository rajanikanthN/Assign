package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Learner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String domine;
	
	public Learner() {
		super();
		
	}
	public Learner(String name, String domine) {
		super();
		this.name = name;
		this.domine = domine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomine() {
		return domine;
	}
	public void setDomine(String domine) {
		this.domine = domine;
	}
	

}
