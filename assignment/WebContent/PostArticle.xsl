<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="structure">
		<html>
		<head>
		<style>
		</style>
		</head>
			<body>
				<div class="outer">
					<div class="container">
						<div class="content">
							<div class ="inner">
	 							<xsl:apply-templates/>
							</div>
							<div class="clear"></div>
							<div class="footer"><p>© UTS WEBSERVICE. All Rights Reserved. Reproduction without explicit permission is prohibited.</p></div>
						</div>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>
	
	<xsl:template match="structure/p">
		<xsl:apply-templates/>
	</xsl:template>
	
	<xsl:template match="content">
			<div class="postForm">
				<form action="PostArticleAction.jsp" method="POST">
					<table>
						<tr><td><xsl:value-of select="Title"/></td><td><input type="text" name="title"></input></td></tr>
						<tr><td><xsl:value-of select="Content"/></td><td><textarea cols="40" rows="5" name="Content"></textarea></td></tr>
						<tr><td><xsl:value-of select="Visible"/></td><td><select name="visible"><option>shown to public</option><option>shown to friends</option><option>private</option></select></td></tr>
						<tr><td></td><td><input type="submit" value="Post"></input></td></tr>
					</table>
				</form>
			</div>
	</xsl:template>

</xsl:stylesheet>
