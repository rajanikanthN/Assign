package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository repo;


	public List<Account> getAll() {
		return repo.getAll();
	}

	public void addAcc(Account theAccount) {
		repo.addAcc(theAccount);
	}

	public Object checkBal(int accno) {
		return repo.checkBal(accno);
	}

	public void deposit(Account theAccount) {
		 repo.deposit(theAccount);
	}

	public void withdraw(Account theAccount) {
		repo.withdraw(theAccount);
		
	}

	public void transfor(int faccno, int taccno) {
		repo.tranfor(faccno,taccno);
		
	}

}
