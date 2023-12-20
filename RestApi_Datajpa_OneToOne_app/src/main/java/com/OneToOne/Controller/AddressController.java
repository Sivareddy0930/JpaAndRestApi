package com.OneToOne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OneToOne.Entity.Address;
import com.OneToOne.Service.AddressServiceImpl;


@RestController
public class AddressController {
	
	
	@Autowired
	private AddressServiceImpl asi;
	
	@PostMapping("/postAllAddress")
	public ResponseEntity<String> saveAllAddressData(@RequestBody List<Address> address){
		String status =asi.saveAllAddress(address);
		return new ResponseEntity(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAddress")
	public ResponseEntity<List<Address>> getAllAddress() {
		List<Address> status=asi.getAllAddress();
		return new ResponseEntity<>(status,HttpStatus.OK);	
	}

}
