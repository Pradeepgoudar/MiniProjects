<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
		<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
		%>
		welcome ${username}
		<br>
		<a href="videos.jsp">Videos here</a><br>
		
		<form action="Logout">
		<input type="submit" value="logout">
		</form>
</body>
</html>