<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
            <h2>Submitted Info</h2>
            <p>Name: <c:out value="${name}"/></p>
            <p>Dojo Location: <c:out value="${location}"/></p>
            <p>Favorite Language: <c:out value="${favoriteLanguage}"/></p>
            <p>Comment: <c:out value="${comment}"/></p>
            <hr>
            <form action='/' method='post'>
                <button type="submit">Home</button>
            </form>
        </div>
</body>
</html>