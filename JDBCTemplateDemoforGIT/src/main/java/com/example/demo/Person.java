package com.example.demo;

public class Person {
	Integer id;
	String name;
	String loc;
	Integer mobile;
	public Person() {
	}
	public Person(Integer id, String name, String loc, Integer mobile) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", loc=" + loc + ", mobile=" + mobile + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
}
