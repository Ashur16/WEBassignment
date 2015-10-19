<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="uts.wsd.*"%>
    
<%
Author author = (Author)session.getAttribute("author");
%>
<html>
<body>
<%	
	// Getting inputted detail from register form
	String headline = request.getParameter("headline");
	String content = request.getParameter("content");

	
	// Get the real path of xml file to update this xml file
	String filePath = application.getRealPath("WEB-INF/review.xml");
%>
<jsp:useBean id="reviewApp" class="uts.wsd.ReviewArticleApp" scope="application">
    <jsp:setProperty name="reviewApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<% if(author == null) { %>
	You are not logged in
	 <% } else {
		String authorId = author.getEmail();
		ReviewArticle article = new ReviewArticle("5" + "6", "8", "test", "3", "hello", "yes");
		reviewApp.addArticle(article);
} %>		
		
	Article posted
</body>
 </html>
