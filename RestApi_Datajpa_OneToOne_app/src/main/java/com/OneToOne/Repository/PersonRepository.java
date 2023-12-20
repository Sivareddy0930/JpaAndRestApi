package com.OneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
