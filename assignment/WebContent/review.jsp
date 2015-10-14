<%@ page language="java" contentType="text/xml; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="uts.wsd.*"%><?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/xsl" href="page.xsl"?>

<% String filePath = application.getRealPath("WEB-INF/hotel.xml"); %>
<jsp:useBean id="hotelApp" class="uts.wsd.HotelApplication" scope="application">
    <jsp:setProperty name="hotelApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>


<% String filePathh = application.getRealPath("WEB-INF/review.xml"); %>
<jsp:useBean id="reviewApp" class="uts.wsd.HotelApplication" scope="application">
    <jsp:setProperty name="reviewApp" property="filePath" value="<%=filePathh%>"/>
</jsp:useBean>

<%
	int id = Integer.parseInt(request.getParameter("id") );
	Hotel hotel = hotelApp.getSingleHotel(id);
	Hotel review = reviewApp.getSingleHotel(id);
%>

<page title="Hotel details for <%= hotel.getName()%>"> 
	<hoteldetail id="<%= hotel.getId()%>" name="<%= hotel.getName()%>" city="<%= hotel.getCity()%>" country="<%= hotel.getCountry()%>" address="<%= hotel.getAddress()%>" number="<%= hotel.getNumber()%>" email="<%= hotel.getEmail()%>">
	</hoteldetail>
</page>