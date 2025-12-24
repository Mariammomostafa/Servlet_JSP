package com.selenium;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/add")
public class AddServlet extends HttpServlet {
	

   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x =Integer.parseInt(request.getParameter("t1"));
		int y = Integer.parseInt(request.getParameter("t2"));
		
		int z = x + y ;
		
		PrintWriter out = response.getWriter();
		out.println(" Output is :  "+ z);
	}

}
