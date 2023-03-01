package org.model.entity;

import java.util.*;
public class Book {
    
	
	

	
	    private String title;
	    private String author;
	    private double price;
	    
	    public Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }
	    
	    public String getTitle() {
	        return title;
	    }
	    
	    public String getAuthor() {
	        return author;
	    }
	    
	    public double getPrice() {
	        return price;
	    }

		public void setTitle(String title) {
			this.title = title;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Book() {
		
			// TODO Auto-generated constructor stub
		}
	

	

}
