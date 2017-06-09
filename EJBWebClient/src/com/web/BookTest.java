package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejb.Book;
import com.ejb.BookBeanRemote;

/**
 * Servlet implementation class BookTest
 */
@WebServlet("/BookTest")
public class BookTest extends HttpServlet {
	@EJB
	BookBeanRemote remote;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out= response.getWriter();
       String s1 =request.getParameter("add");
       String s2= request.getParameter("list");
       if(s1 != null)
       {
    	   int bno = Integer.parseInt(request.getParameter("bno"));
    	   String bname= request.getParameter("bname");
    	   int price= Integer.parseInt(request.getParameter("price"));
    	   Book b = new Book();
    	   b.setBno(bno);
    	   b.setBname(bname);
    	   b.setPrice(price);
    	   remote.addBook(b);
    	   response.sendRedirect("/EJBWebClient/Book.html");
       }
       if(s2 != null)
       {
    	   List<Book> books = remote.listBooks();
    	out.println("<table border>");
    	out.println("<tr><th>Book Num</th><th>Book Name</th><th>Book Price</th></tr>");
    	for(Book b :books)
    		out.println("<tr><td>"+ b.getBno()+ "</td><td>"+ b.getBname()+ "</td><td>" + b.getPrice() + "</td><tr>");
			out.println("</table>");
    	}
	}

	

}
