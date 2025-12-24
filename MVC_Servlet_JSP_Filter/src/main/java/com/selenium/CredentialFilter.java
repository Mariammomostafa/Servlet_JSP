package com.selenium;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebFilter("/login")
public class CredentialFilter implements Filter{

	
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		
		HttpServletRequest request	 =(HttpServletRequest)req;
		HttpServletResponse response =(HttpServletResponse) resp;
		
		PrintWriter out =  response.getWriter();

		String name = request.getParameter("name");
		int password = Integer.parseInt(request.getParameter("pass"));
		
		if(password < 1 || name.length() < 3) {
			
			out.println("Invalid Credentials..");
			
		}else {
			chain.doFilter(request, response);

		}
		
	}

}
