package com.OneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
