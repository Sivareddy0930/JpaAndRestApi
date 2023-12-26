package com.mappings.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
	@Id
	@SequenceGenerator(name = "book_sequence",sequenceName = "book_sequence",allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "book_sequence")
	private Long b_code;
	private String b_name;
	
	@OneToOne(mappedBy = "book",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonBackReference
	private Student student;
}
