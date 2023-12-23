package com.mappings.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
