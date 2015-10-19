<%@ page language="java" contentType="text/xml; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="uts.wsd.*"%><?xml version="1.0" encoding="UTF-8"?>
    
<%
Author author = (Author)session.getAttribute("author");
%>

<%	
	// Getting inputted detail from register form
	String title = request.getParameter("headline");
	String content = request.getParameter("content");
String filePath = application.getRealPath("WEB-INF/review.xml");
%>
<jsp:useBean id="reviewApp" class="uts.wsd.ReviewArticleApp" scope="application">
    <jsp:setProperty name="reviewApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<%		String authorId = author.getEmail();
		ReviewArticle article = new ReviewArticle(authorId + "1", authorId, "o", "ok", content, "yes");
		reviewApp.addArticle(article);		
		

 %>		
		
	Article posted

 
