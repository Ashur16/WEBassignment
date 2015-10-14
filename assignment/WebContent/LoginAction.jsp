<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uts.wsd.Author"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>loginAction</title>
</head>
<body>

<% String filePath = application.getRealPath("WEB-INF/authors.xml"); %>
	<jsp:useBean id="loginApp" class="uts.wsd.LoginApp" scope="application">
    <jsp:setProperty name="loginApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<%

String email = request.getParameter("email");
String password = request.getParameter("password");

%>

<% 
if (loginApp.getAuthors().login(email, password) != null) { 

session.setAttribute("author", loginApp.getAuthors().login(email, password));
%>

Login successful. Click <a href="index.jsp">here </a> to return to the main page.

<%  } else { %>

Password incorrect. Click <a href="login.jsp">here </a> to try again.

<% } %>





</body>
</html>