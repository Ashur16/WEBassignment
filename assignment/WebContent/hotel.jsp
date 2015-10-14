<%@ page language="java" contentType="text/xml; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="uts.wsd.*"%><?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/xsl" href="page.xsl"?>

<% String filePath = application.getRealPath("WEB-INF/hotel.xml"); %>
<jsp:useBean id="hotelApp" class="uts.wsd.HotelApplication" scope="application">
    <jsp:setProperty name="hotelApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<%
	int id = Integer.parseInt(request.getParameter("id") );
	Hotel hotel = hotelApp.getSingleHotel(id);
%>

<page title="Hotel details for <%= hotel.getName()%>"> 

	<navmenu>
		<item title="home" href="index.jsp"/>
		<item title="login" href="login.jsp"/>
	</navmenu>
	
	<hoteldetail id="<%= hotel.getId()%>" name="<%= hotel.getName()%>" city="<%= hotel.getCity()%>" country="<%= hotel.getCountry()%>" address="<%= hotel.getAddress()%>" number="<%= hotel.getNumber()%>" email="<%= hotel.getEmail()%>">
	</hoteldetail>
</page>