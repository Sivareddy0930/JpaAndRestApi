package com.OneToOne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OneToOne.Entity.Person;
import com.OneToOne.Service.PersonServiceImpl;

@RestController
public class PersonController {
	
	@Autowired
	private PersonServiceImpl psi;
	
	@PostMapping("/post")
	public ResponseEntity<Person> createPerson(@RequestBody Person p){
		Person status=psi.createPerson(p);
		return new ResponseEntity<Person>(status,HttpStatus.CREATED);
	}
	@PutMapping("/put")
	public ResponseEntity<Person> updatePerson(@RequestBody Person p){
		Person status=psi.updatePerson(p);
		return new ResponseEntity<Person>(status,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Person> getById(@PathVariable Long pid){
		Person status=psi.getPerson(pid);
		return new ResponseEntity<Person>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public String deletePerson(@PathVariable Long pid){
		psi.deletePerson(pid);
		return "deleted";
	}
}
