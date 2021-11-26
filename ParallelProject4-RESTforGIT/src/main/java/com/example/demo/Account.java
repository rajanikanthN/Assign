package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Account {
	int accNo;
	String name;
	int pass;
	String loc;
	int bal;
	
	public Account() {

	}
	public Account(int accNo, String name, int pass, String loc, int bal) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.pass = pass;
		this.loc = loc;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", pass=" + pass + ", loc=" + loc + ", bal=" + bal + "]";
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	

}
