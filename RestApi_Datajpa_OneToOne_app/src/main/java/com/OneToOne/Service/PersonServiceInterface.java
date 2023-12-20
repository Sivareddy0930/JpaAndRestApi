package com.OneToOne.Service;

import java.util.List;

import com.OneToOne.Entity.Person;

public interface PersonServiceInterface {
	public String saveAllPersons(List<Person> persons);
	public List<Person> getAllPersons();
}
