package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;

	public Iterable<Address> getAllAddress() {
		return addressRepository.findAll();
	}

	public Object addressById(int id) {  
		return addressRepository.findById(id);
	}

	public Address postAddress(Address theAddress) {
		return addressRepository.save(theAddress);
	}

	public void updateAddress(Address theAddress, int id) {
		Address address = addressRepository.findById(id)
				.orElseThrow();
		address.setAddressLine(theAddress.getAddressLine());
		address.setLocality(theAddress.getLocality());
		address.setCity(theAddress.getCity());
		address.setDistrict(theAddress.getDistrict());
		address.setState(theAddress.getState());
		address.setCountry(theAddress.getCountry());
		address.setPincode(theAddress.getPincode());
		
		Address updateAddress = addressRepository.save(address); 
	}

	public void deleteAddress(int id) {
		addressRepository.deleteById(id);
	}
	
}
