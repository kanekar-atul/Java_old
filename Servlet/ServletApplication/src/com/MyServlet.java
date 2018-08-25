package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
 
	
	public void init() {
		System.out.println("From init() method");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Setting up the content type of webpage
	      response.setContentType("text/html");

	      // Writing message to the web page
	      PrintWriter out = response.getWriter();
	      out.println("<h1> Welcome </h1>");
	}
	
	public void destroy() {
	}
}
