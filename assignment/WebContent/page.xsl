<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="page">
		<html>
			<head>
				<title><xsl:value-of select="@title"/></title>
				<style> <!-- styles for hotel detail used later -->
					.name { 
						font-style: italic;
					}
					.city {
						font-weight: bold;
					}
					.country {
						color: red;
					}
				</style>
			</head>
			<body>
				<h1><xsl:value-of select="@title"/></h1>
				<xsl:apply-templates/>	
			</body>
		</html>
	</xsl:template>
	
	<xsl:template match="navmenu">
		<ul>
			<xsl:apply-templates/>	
		</ul>
	</xsl:template>
	
	<xsl:template match="item">
		<li> 
			<a href="{@href}"> <xsl:value-of select="@title"/> </a>
		</li>
	</xsl:template>
	
	
	<xsl:template match="hotellist">
		<table>
			<thead>
				<tr><th>Hotel</th><th>City</th><th>Country</th></tr> <!-- TODO: make better headings -->
			</thead>
			<tbody>
				<xsl:apply-templates/>
			</tbody>
			</table>
	</xsl:template>
	<xsl:template match="hotellink">
		<tr>  <!-- table data. Flled with hotel name, city, country and link -->
			<td><xsl:value-of select="@name"/></td>  
			<td><xsl:value-of select="@city"/></td>
			<td><xsl:value-of select="@country"/></td>
			<td><a href="hotel.jsp?id={@id}">view</a></td>
		</tr>
	</xsl:template>

	<xsl:template match="hoteldetail">
		<table>
			<tr>
				<td>    <!-- left side of page-->
					<img src="images/hotels/{@id}.jpg" width="200"/>
					<div>Name: <span class="name"> <xsl:value-of select="@name"/></span></div>
					<div>City: <span class="city"> <xsl:value-of select="@city"/></span></div>
					<div>Country: <span class="country"> <xsl:value-of select="@country"/></span></div>			
				</td>
				
				<td> <!-- right side of page-->
					<div>Address: <span class="address"> <xsl:value-of select="@address"/></span></div>
					<div>Number: <span class="number"> <xsl:value-of select="@number"/></span></div>
					<div>Email: <span class="email"> <xsl:value-of select="@email"/></span></div>
				</td>
			</tr>
		</table>
	
	</xsl:template>
	
	<xsl:template match="reviews">
	<h1>Reviews:</h1>
					<xsl:apply-templates/>
	
	</xsl:template>
	
	<xsl:template match="review">
	<td>
		
		<p><a href="review.jsp?id={@id}"><xsl:value-of select="@name"/></a> - <xsl:value-of select="@date"/></p>
	</td>
	</xsl:template>
	

	
	
</xsl:stylesheet>