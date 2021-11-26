package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bank")
public class AccountControllr {

	@Autowired
	AccountService service;

// Get all Accounts
	@RequestMapping("all")
	List<Account> getAll() {
		return service.getAll();
	}

// Adding new Account
	@PostMapping("add")
	void addAcc(@RequestBody Account theAccount) {
		service.addAcc(theAccount);
	}

//	Check Bal
	@RequestMapping("bal/{accno}")
	Object checkBal(@PathVariable int accno) {
		return service.checkBal(accno);
	}

//	Deposit money 
	@PutMapping("dep")
	void deposit(@RequestBody Account theAccount) {
		service.deposit(theAccount);
	}
	
//	Withdraw
	@PutMapping("with")
	void withdraw(@RequestBody Account theAccount) {
		service.withdraw(theAccount);
	}
//	Transfer
	@PutMapping("tran{faccno/taccno}")
	void transfor(@PathVariable int faccno, @PathVariable int taccno ) {
		service.transfor(faccno,taccno);
	}

}
