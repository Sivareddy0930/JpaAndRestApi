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
	public List<Person> findByMobile(String mobile) {
		List<Person> st=pr.findByMobile(mobile);
		return st;
	}
	
	
	
	

}
