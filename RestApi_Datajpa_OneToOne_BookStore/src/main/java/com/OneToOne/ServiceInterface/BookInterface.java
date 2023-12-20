package com.OneToOne.ServiceInterface;

import org.springframework.stereotype.Component;
import com.OneToOne.Entity.Book;


@Component
public interface BookInterface {
	
	public Book saveBook(Book book);

	public Book findByBookId(Long bookId);
	
}
