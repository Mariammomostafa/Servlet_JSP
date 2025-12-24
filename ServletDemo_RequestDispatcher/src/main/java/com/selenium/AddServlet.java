package com.selenium;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class AddServlet extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request , response);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		service(req , resp);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x =Integer.parseInt(request.getParameter("t1"));
		int y = Integer.parseInt(request.getParameter("t2"));
				
		System.out.println(x + " : " + y);
		
		int z = x + y ;
		request.setAttribute("result", z);
		
		RequestDispatcher rs = request.getRequestDispatcher("result");
		rs.forward(request, response);
	}
	
	

}
