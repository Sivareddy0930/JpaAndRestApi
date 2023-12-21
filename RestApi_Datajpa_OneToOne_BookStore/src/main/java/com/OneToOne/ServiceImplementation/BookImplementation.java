package com.OneToOne.ServiceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToOne.Entity.Book;
import com.OneToOne.Entity.Story;
import com.OneToOne.Repository.BookRepository;
import com.OneToOne.ServiceInterface.BookInterface;

@Service
public class BookImplementation implements BookInterface {
	
	@Autowired
	private BookRepository br;
	
	@Override
	public Book saveBook(Book book) {
		
//		Story story=book.getStory();
//		story.setBook(book);
		book=br.save(book);
		return book;
	}

	@Override
	public Book findByBookId(Long bookId) {
	Optional<Book> o=br.findById(bookId);
	
	if(o.isPresent()) {
		return o.get();
	}
	else {
		return null;
	}
		
	}

}
