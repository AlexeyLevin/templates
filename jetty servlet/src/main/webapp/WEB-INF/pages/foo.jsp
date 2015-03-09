<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>

	<link href='http://fonts.googleapis.com/css?family=Play'
		  rel='stylesheet' type='text/css'/>

	<link rel="stylesheet" href="css/main.css"/>

	<script src="js/main.js"></script>

	<title>Foo Servlet</title>
</head>
<body>
	<h2>Foo Servlet</h2>
	<p>Request URI: ${pageContext.request.requestURI}</p>
	<p>Protocol: ${pageContext.request.protocol}</p>
	<p>PathInfo: ${pageContext.request.pathInfo}</p>
	<p>Remote Address: ${pageContext.request.remoteAddr}</p>
	<p>A Random Number: <strong>${number}</strong></p>
</body>
</html>
