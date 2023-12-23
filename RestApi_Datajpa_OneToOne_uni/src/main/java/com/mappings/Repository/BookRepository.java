package com.mappings.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
