package com.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface BookBeanRemote {
public void addBook(Book b);
public List listBooks();
}
