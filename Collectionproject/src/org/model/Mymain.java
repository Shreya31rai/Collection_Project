package org.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.model.entity.Book;
import org.model.dao.Bookstore;
import org.model.daoimpl.Bookstoreimpl;
public class Mymain {
  public static	void main(String[] args) {
 Bookstoreimpl store = new Bookstoreimpl();
//  store.addBook(new Book("Girl in room 105", "Roman gays", 12));
//  store.addBook(new Book("Garbage n dust", "Fred Lane", 8.1));
//  store.addBook(new Book("1984", "George Orwell", 23));
//  store.addBook(new Book("Power of mind", "Jury audwin", 5.66));
  Scanner sc = new Scanner(System.in);
 // List<Book> bks=new ArrayList();
  for(int i =0;i<3;i++) {
	 // Bookstoreimpl bk =new Bookstoreimpl();
       Book bk = new Book();
  System.out.println("Give book name ");
  bk.setTitle( sc.next());
  System.out.println("Give author name ");
   bk.setAuthor(sc.next());
  System.out.println("Give Price");
    bk.setPrice(sc.nextDouble());
  store.addBook(bk);
  }
  
  System.out.println("All books:");
  List<Book> allBooks = store.getAllBooks();
  for (Book book : allBooks) {
      System.out.println(book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice());
  }
  
  System.out.println("\nSearch results by name");
  String str = sc.next();
  List<Book> searchResults = store.searchBooks(str);
  for (Book book : searchResults) {
      System.out.println(book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice());
  }
  
  System.out.println("\nTotal revenue: $" + store.getTotalRevenue());
	  
}
}
