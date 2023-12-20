package com.OneToOne.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToOne.Entity.Person;
import com.OneToOne.Repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonServiceInterface {
	
	@Autowired
	private PersonRepository pr;
	
	@Override
	public String saveAllPersons(List<Person> persons) {
		pr.saveAll(persons);
		return "succesfully saved all data";
	}

	@Override
	public List<Person> getAllPersons() {
		List<Person> l=pr.findAll();
		return l;
	}
	
	

}
