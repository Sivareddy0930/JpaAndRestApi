package com.OneToOne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OneToOne.Entity.Person;
import com.OneToOne.Service.PersonServiceImpl;

@RestController
public class PersonController {
	
	@Autowired
	private PersonServiceImpl psi;
	
	@GetMapping("/getAllpersons/{mobile}")
	public ResponseEntity<List<Person>> getByMobile(@PathVariable String mobile) {
		List<Person> status=psi.findByMobile(mobile);
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	
}
