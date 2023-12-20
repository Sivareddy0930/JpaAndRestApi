package com.OneToOne.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

public class Story {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE
			)
	private Long storyId;
	private String storyName;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(
			name = "book_Id",
			referencedColumnName = "bookId"
			)
	@JsonBackReference
	private Book book;
//	 it means that the entity containing this field has a one-to-one relationship with the Book entity.
}
