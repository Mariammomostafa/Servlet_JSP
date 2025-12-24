package com.selenium.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.selenium.model.Student;

public class LoginDao {
	
	
	public boolean check(String name , String pass) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring-jpa-hibernate", "root", "root");
		
		PreparedStatement ps= con.prepareStatement("select * from userInfo where username =? and password =?");
		ps.setString(1, name);
		ps.setString(2, pass);
		
		ResultSet set = ps.executeQuery();
		
		 if(set.next())
		 {
			return true; 
		 }
	
		return false;
	}
	
	
public Student getStudentById(int id) throws ClassNotFoundException, SQLException {
		
		Student s = new Student();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring-jpa-hibernate", "root", "root");
		
		PreparedStatement ps= con.prepareStatement("select * from userInfo where id= ? ");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		 if(rs.next())
		 {
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("username"));
			s.setMarks(rs.getInt("marks"));
			
		 }
	
		return s;
	}

}
