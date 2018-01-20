package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HomeServlet extends HttpServlet {
    
	  private static final long serialVersionUID = 1L;
      
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public HomeServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String username = (String) request.getParameter("username");
    	String pass = (String) request.getParameter("pass");
    	System.out.println(username +" "+ pass);
    	if(username.equals("valera") && pass.equals("555")){
    	 response.getWriter().println("<!DOCTYPE HTML>");
    	 response.getWriter().println("<html><body>"
    	 		+ "<h1>Hello!  </h1><h2>" + username + "</h2></body></html>");
    	}
    	else{
    		 response.getWriter().println("<!DOCTYPE HTML>");
        	 response.getWriter().println("<html><body>"
        	 		+ "<h1>Access Denied!</h1></body></html>");	
    	}
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
     }
    
}
