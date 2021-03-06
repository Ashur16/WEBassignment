<%@ page language="java" contentType="text/xml; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="uts.wsd.*"%><?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/xsl" href="hotel.xsl"?>

<% String filePath = application.getRealPath("WEB-INF/hotel.xml"); %>
<jsp:useBean id="hotelApp" class="uts.wsd.HotelApplication" scope="application">
    <jsp:setProperty name="hotelApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<page title="<%= hotelApp.getHotels().getTitle() %> ">

	<navmenu>
		<item title="home" href="index.jsp"/>	
		<item title="login" href="login.jsp"/>	
		
<%
Author author = (Author)session.getAttribute("author");
%>
		
<% if (author != null) { %>

You are logged in as <%= author.getName() %> &lt;<%= author.getEmail() %>&gt;
<item title="Logout" href="Logout.jsp"/>
<%  } else { %>

You are not logged in

<%	} %>
		
	</navmenu>
	
	<hotellist> 
		<% for (Hotel hotel : hotelApp.getHotelist()) { %>
			<hotellink id="<%= hotel.getId()%>" name="<%= hotel.getName()%>" city="<%= hotel.getCity()%>" country="<%= hotel.getCountry()%>" />
   		<% } %>
	</hotellist> 
</page>