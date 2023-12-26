package com.mappings.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mappings.Entity.Book;
import com.mappings.Entity.Student;
import com.mappings.ServicesInterfaceImplementation.BookImplementation;
import com.mappings.ServicesInterfaceImplementation.StudentImplementation;

@RestController
@RequestMapping("/book")
public class BookController {
	
	private final BookImplementation bookImplementation;
	
	@Autowired
	public BookController(BookImplementation bookImplementation) {
		this.bookImplementation=bookImplementation;
	}
	
	@PostMapping("/post")
	public ResponseEntity<Book> postStudent(@RequestBody Book book) {
		
		Book status=bookImplementation.postBook(book);
		
		return new ResponseEntity<Book>(status,HttpStatus.CREATED);
	}
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable Long id) {
		return bookImplementation.getBook(id);
		
	}
	
}
