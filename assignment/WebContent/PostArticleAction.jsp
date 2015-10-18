<%@ include file="Navigation.jsp" %>	

<%	
	// Getting inputted detail from register form
	String title = request.getParameter("headline");
	String content = request.getParameter("Content");
	String shownFor = request.getParameter("visible");
	String visible;
	String srt ="";
	// Convert visible field to specific format
	if(shownFor.equals("shown to public")) {
		visible = "public";
	} else if(shownFor.equals("shown to friends")) {
		visible = "friend";
	} else {
		visible = "private";
	}	
	// Getting date of today
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date today = new Date();
	String stringToday = dateFormat.format(today);
	// Perpare article id
	SimpleDateFormat articleIdFormat = new SimpleDateFormat("ddMMyyHHmmss");
	String genArticleId = articleIdFormat.format(today);
	// Get the real path of xml file to update this xml file
	String filePath = application.getRealPath("WEB-INF/blogArticle.xml");
%>
<jsp:useBean id="ReviewArticleApp" class="uts.wsd.ReviewArticleApp" scope="application">
    <jsp:setProperty name="ReviewArticleApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<% if(author == null) {
	srt = "You are not login";
 } else if(!title.equals("") && !content.equals("")) {
		String authorId = author.getEmail();
		ReviewArticle article = new ReviewArticle(authorId + genArticleId, authorId, headline, stringToday, content, visible);
		ReviewArticleApp.addArticle(article);
		srt = "Article posted";
	} else {
	srt = "Sorry, you did not enter anything for the post";
} %>
 
<c:set var="xmltext">
	<structure>
		<content>
			<message><%=srt %></message>
			<button>Main page</button>
		</content>
	</structure>		
</c:set>
<c:import url="action.xsl" var="xslt"/>
<x:transform xml="${xmltext}" xslt="${xslt}"/>