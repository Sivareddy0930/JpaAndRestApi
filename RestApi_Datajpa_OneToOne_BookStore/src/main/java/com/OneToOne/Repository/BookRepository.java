package com.OneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.Entity.Book;
import com.OneToOne.Entity.Story;

public interface BookRepository extends JpaRepository<Book, Long> {

}
