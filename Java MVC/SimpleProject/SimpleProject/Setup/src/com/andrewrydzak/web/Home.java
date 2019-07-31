package com.andrewrydzak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String firstName = request.getParameter("firstName");
	    String lastName = request.getParameter("lastName");
	    String favLang = request.getParameter("favLang");
	    String hmTown = request.getParameter("hmTown");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String write1 = firstName == null ? "<h1>Welcome: Unknown</h1>" : "<h1>Welcome: " + firstName +  lastName +"</h1>"; 
	    String write2 = favLang == null ? "<h1>Your Favorite Language is: Unknown</h1>" : "<h3>Your Favorite Language is: " + favLang +"</h3>"; 
	    String write3 = hmTown == null ? "<h3>You are from: Unknown</h3>" : "<h3>You are from: " + hmTown +"</h3>"; 

	    out.write(write1);
	    out.write(write2);
	    out.write(write3);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
