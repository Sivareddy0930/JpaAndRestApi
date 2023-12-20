package com.OneToOne.Service;

import java.util.List;

import com.OneToOne.Entity.Address;


public interface AddressServiceInterface {
	public String saveAllAddress(List<Address> address);
	public List<Address> getAllAddress();
}
