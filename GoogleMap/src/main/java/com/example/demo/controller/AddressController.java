package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/api/")
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@GetMapping("address")
	Iterable<Address> getAllAddress() {
		return addressService.getAllAddress();
	}
	
	@GetMapping("address/{id}")
	Object addressById(@PathVariable int id) {
		return addressService.addressById(id);
	}
	
	@PostMapping("/address")
	public Address postAddress(@RequestBody Address theAddress) {
		return addressService.postAddress(theAddress);
	}
	
	@PutMapping("/address/{id}")
	void updateAddress(@PathVariable int id , @RequestBody Address theAddress) {
		addressService.updateAddress(theAddress, id);
	}
	
	@DeleteMapping("/address/{id}")
	void deleteAddress(@PathVariable int id) {
		addressService.deleteAddress(id);
	}
}
