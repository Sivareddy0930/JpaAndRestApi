package com.OneToOne.Service;

import java.util.List;

import com.OneToOne.Entity.Person;

public interface PersonServiceInterface {
	public List<Person> findByMobile(String mobile);
}
