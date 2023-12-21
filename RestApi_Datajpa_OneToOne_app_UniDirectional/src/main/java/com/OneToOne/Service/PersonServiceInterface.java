package com.OneToOne.Service;

import java.util.List;

import com.OneToOne.Entity.Person;

public interface PersonServiceInterface {
	 public Person createPerson(Person p);
	    public Person updatePerson(Person p);
	    public Person getPerson(Long pId);
	    public void deletePerson(Long pId);
}
