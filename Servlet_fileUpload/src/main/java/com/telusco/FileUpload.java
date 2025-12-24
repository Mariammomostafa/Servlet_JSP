package com.telusco;

import java.io.IOException;
import java.util.Collection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;


@WebServlet("/upload")
@MultipartConfig
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try {
		    final Collection<Part> parts = request.getParts();
		    for (final Part part : parts) {
		       part.write("E:/photos/uploadFiles/"+ part.getSubmittedFileName());
		    }
		    
		    response.getWriter().print("The file has been uploaded successfully.");
		
		} catch (Exception e) {
		    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Upload failed.");
		}

	}

}
