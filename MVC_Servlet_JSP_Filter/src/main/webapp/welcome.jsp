<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     

	<%
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
	 
	
	if (session.getAttribute("name") == null) {

		response.sendRedirect("index.jsp");
	}

	String name = (String) session.getAttribute("name");
	out.println("Welcome " + name);
	%>

	<a href="videos.jsp"> Videos Here</a><br><br>

	<form action="logout">

		<input type="submit" value="logout">

	</form>

</body>
</html>