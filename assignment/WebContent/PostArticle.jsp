<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post an article</title>
</head>
<body>
<form action="PostArticleAction.jsp" method="POST">

<table>
<tr><td>Headline</td><td><input type="text" name="headline"></td></tr>
<tr><td>Content</td><td><input type="text" name="content"></td></tr>

<tr><td><input type="submit" value="Post"></td></tr>

</table>
</form>
</body>
</html>