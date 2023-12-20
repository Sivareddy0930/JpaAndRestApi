package com.OneToOne.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToOne.Entity.Address;
import com.OneToOne.Repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressServiceInterface {

	@Autowired
	private AddressRepository ar;
	@Override
	public String saveAllAddress(List<Address> address) {
		ar.saveAll(address);
		return "saved all address";
	}

	@Override
	public List<Address> getAllAddress() {
		List<Address> l=ar.findAll();
		return l;
	}

}
