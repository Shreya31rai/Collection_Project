package org.model.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.model.dao.Bookstore;
import org.model.entity.Book;

public class Bookstoreimpl {
        
	 private Map<String, Book> books = new HashMap<>();
	Bookstore bs ;
	
	public void addBook(Book book){
	books.put(book.getTitle(), book);
	}
	  
   
    
    public Book findBook(String title) {
        return books.get(title);
    }
    
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }
    
    public List<Book> searchBooks(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                results.add(book);
            }
        }
        return results;
    }
    
    public double getTotalRevenue() {
        double totalRevenue = 0.0;
        for (Book book : books.values()) {
            totalRevenue += book.getPrice();
        }
        return totalRevenue;
    }

	
}
