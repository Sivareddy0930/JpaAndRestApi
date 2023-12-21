package com.OneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.Entity.Person;
import java.util.List;


public interface PersonRepository extends JpaRepository<Person, Long> {
	 List<Person> findByMobile(String mobile);
}
