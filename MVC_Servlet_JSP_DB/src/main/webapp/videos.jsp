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
	out.println("Welcome " + name + " in Videos Page ");
	%>

	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/KlE8-E4rt44?si=MBJnscdjh02wBDlP"
		title="YouTube video player" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
		referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>