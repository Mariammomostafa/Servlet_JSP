package com.selenium;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.selenium.dao.LoginDao;
import com.selenium.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/getStudent")
public class GetStudentServlet extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request , response);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		service(req , resp);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
				
		LoginDao dao = new LoginDao();
					
		try {
			Student student = dao.getStudentById(id);
			
			request.setAttribute("std", student);
			
			RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
			rd.forward(request, response);
	
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
