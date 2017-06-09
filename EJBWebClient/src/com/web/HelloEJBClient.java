package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejb.HelloBeanRemote;


@WebServlet("/HelloEJBClient")
public class HelloEJBClient extends HttpServlet {
	@EJB
	HelloBeanRemote remote ;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		out.println(remote.sayHello());
		}

}

 
