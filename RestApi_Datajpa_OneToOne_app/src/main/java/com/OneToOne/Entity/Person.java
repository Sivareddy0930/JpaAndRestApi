package com.OneToOne.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {
	
	@Id
	@SequenceGenerator(
			name="person_sequence",
			sequenceName = "person_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "person_sequence"
			)
	private Long id;
	private String name;
	private String mobile;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(
			name="address_id",
			referencedColumnName = "addressId"
			)
	private Address address;
	
}
