<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
Author author = (Author)session.getAttribute("author");
%>

<%	
	// Getting inputted detail from register form
	String title = request.getParameter("headline");
	String content = request.getParameter("Content");

	// Perpare article id
	SimpleDateFormat articleIdFormat = new SimpleDateFormat("ddMMyyHHmmss");
	String genArticleId = articleIdFormat.format(today);
	// Get the real path of xml file to update this xml file
	String filePath = application.getRealPath("WEB-INF/review.xml");
%>
<jsp:useBean id="ReviewArticleApp" class="uts.wsd.ReviewArticleApp" scope="application">
    <jsp:setProperty name="ReviewArticleApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<% if(session.setAttribute("author") == null) { %>
	You are not logged in
	 <% } else(!headline.equals("") && !content.equals("")) {
		String authorId = author.getEmail();
		ReviewArticle article = new ReviewArticle(authorId + genArticleId, authorId, headline, stringToday, content, visible);
		ReviewArticleApp.addArticle(article);
} %>		
		
	Article posted

 
