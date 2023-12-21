package com.OneToOne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OneToOne.Entity.Book;
import com.OneToOne.Entity.Story;
import com.OneToOne.Repository.BookRepository;
import com.OneToOne.ServiceImplementation.BookImplementation;
import com.OneToOne.ServiceInterface.BookInterface;

@RestController
public class BookController {
	
	@Autowired
	private BookImplementation bi;
	
	@PostMapping("/post")
	public Book saveBook(@RequestBody Book book) {
        Book bookResponse = bi.saveBook(book);
        return bookResponse;
    }
	
	@GetMapping("/getAllpersons/{bookId}")
	 public Book getBookDetails(@PathVariable Long bookId) {
        Book bookResponse = bi.findByBookId(bookId);

        return bookResponse;
    }
	
}
