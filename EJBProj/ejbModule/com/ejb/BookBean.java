package com.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BookBean
 */
@Stateless
@LocalBean
public class BookBean implements BookBeanRemote {

   List<Book> books;
   public BookBean(){
	   books = new ArrayList<Book>();
   }
@Override
public void addBook(Book b) {
	// TODO Auto-generated method stub
	books.add(b);
}
@Override
public List listBooks() {
	// TODO Auto-generated method stub
	return books;
}


    }


