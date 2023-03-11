<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.techpalle.model.Student" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Uploaded!!!</title>
</head>
<body>
<h1>Welcome to the Student!</h1>
<%
Student s1=(Student)request.getAttribute("obj");
out.println("<h1> sno:<br/>"+s1.getSno());
out.println("<h1> sname:<br/>"+s1.getName());
out.println("<h1> sub:<br/>"+s1.getSub());

%>

</body>
</html>