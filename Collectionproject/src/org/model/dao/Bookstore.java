package org.model.dao;

import java.util.List;

import org.model.entity.Book;

public interface Bookstore {
    
	public void addBook(Book book);
	public Book findBook(String title); 
	 public List<Book> getAllBooks() ;
	 public List<Book> searchBooks(String keyword);
}
