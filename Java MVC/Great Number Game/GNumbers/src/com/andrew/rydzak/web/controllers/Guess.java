package com.andrew.rydzak.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Guess
 */
@WebServlet("/Guess")
public class Guess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Guess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
//		String number = (String) session.getAttribute("number");
		int guess = (int) Integer.parseInt(request.getParameter("guess"));
		int number = (int) session.getAttribute("number");
		
		if(guess ==number) {
			session.setAttribute("result", "correct");
		}else if(guess>number) {
			session.setAttribute("result", "high");
		}else {
			session.setAttribute("result", "low");
		}
		
        response.sendRedirect("/GNumbers/Home");
	}

}