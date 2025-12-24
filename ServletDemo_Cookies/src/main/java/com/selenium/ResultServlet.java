package com.selenium;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/result")
public class ResultServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name = null ;
	Cookie[] cookies = request.getCookies();
	
	for (Cookie cookie : cookies) {
		
		if(cookie.getName().equals("res")) {
			
			name = cookie.getValue();
		}
		
	}
		
		PrintWriter out = response.getWriter();
		out.println("Full Nmae is : " + name);
	
	}
}
