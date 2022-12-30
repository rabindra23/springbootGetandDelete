package com.masai.webapp.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.webapp.example.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

	public List<Book> findByBookId(int book_id);
}
