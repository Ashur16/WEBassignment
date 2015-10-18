<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" import="java.text.*" 
    import="uts.wsd.*" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
// Getting session
Author author = (Author)session.getAttribute("author");
%>


<c:import url="Navigation.xsl" var="xslt"/>	
<c:set var="xmltext">
	<authors>
			<% if(author != null) {%>
			<username><%= author.getName() %></username>
			<% } else {%>
			<noUsername></noUsername>
			<% } %>
	</authors>
</c:set>
<c:import url="Navigation.xsl" var="xslt"/>
<x:transform xml="${xmltext}" xslt="${xslt}"/>
