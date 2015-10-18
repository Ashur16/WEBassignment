<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
	<xsl:template match="authors">
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
			<link rel="stylesheet" type="text/css" href="styles/navStyle.css"/>
			<link rel="stylesheet" type="text/css" href="styles/style.css"/>
			<link rel="stylesheet" type="text/css" href="styles/font.css"/>
			<link rel="stylesheet" type="text/css" href="styles/button.css"/>
			<link rel="stylesheet" type="text/css" href="styles/allblog.css"/>
			<link rel="stylesheet" type="text/css" href="styles/loginForm.css"/>
			<link rel="stylesheet" type="text/css" href="styles/RegisterForm.css"/>
			<link rel="stylesheet" type="text/css" href="styles/postBlog.css"/>
			<link rel="stylesheet" type="text/css" href="styles/friendList.css"/>
			<link rel="stylesheet" type="text/css" href="styles/action.css"/>
			<link rel="stylesheet" type="text/css" href="styles/add_friend.css"/>		
		</head>
			<body>
				<div class="wrapnav">
		        	<div id='cssmenu'>
		            	<ul>			              
			                <li class='active'><a href='index.jsp'>Home</a></li>
			                <li class='has-sub'><a href='#'><span>Company</span></a></li>
		                	<li class='last'><a href='#'><span>Contact</span></a></li>
		 						<xsl:if test="username != 'null'">
		 						<xsl:apply-templates/>
		 						</xsl:if>
		 						<xsl:if test="noUsername != 'null' ">
			 						<li class='doNothing'><a href='#'><span>&#160;</span></a></li>
						      		<li class='last'><a href='login.jsp'><span>Login</span></a></li>
						      		<li class='last'><a href='register.jsp'><span>Register</span></a></li>
		 						</xsl:if>
	 					</ul>
	 				</div>
	 			</div>
			</body>
		</html>
	</xsl:template>

	<xsl:template match="username">
						<li class='last'><a href='edit_user.jsp'><span>My Account</span></a></li>
	      				<li class='username'><a href='edit_user.jsp'><span >Welcome back,<xsl:apply-templates/></span></a></li>
	      				<li class='last'><a href='logout.jsp'><span>Logout</span></a></li>	
	</xsl:template>
	

</xsl:stylesheet>
