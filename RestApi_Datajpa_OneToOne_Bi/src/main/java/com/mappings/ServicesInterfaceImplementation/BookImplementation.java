package com.mappings.ServicesInterfaceImplementation;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappings.Entity.Book;
import com.mappings.Entity.Student;
import com.mappings.Repository.BookRepository;
import com.mappings.Repository.StudentRepository;
import com.mappings.ServicesInterface.StudentService;

@Service
public class BookImplementation  {

	private final BookRepository bookRepository;
	
	@Autowired
	public BookImplementation(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}

	
	public Book postBook(Book s) {
		
		return bookRepository.save(s);
	}
	
	public Book getBook(Long id) {
		return bookRepository.findById(id).get();
		
	}


}
