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
	public Person createPerson(Person p) {
		
		return pr.save(p);
	}

	@Override
	public Person updatePerson(Person p) {
	
		return pr.save(p);
	}

	@Override
	public Person getPerson(Long pId) {
		
		return pr.findById(pId).get();
	}

	@Override
	public void deletePerson(Long pId) {
		pr.deleteById(pId);
		
	}


	
	
	

}
