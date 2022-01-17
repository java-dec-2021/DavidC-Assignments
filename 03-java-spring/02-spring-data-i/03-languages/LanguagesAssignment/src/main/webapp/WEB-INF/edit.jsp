<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${targetLang.name}"/></title>
<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<p>
		<form action="/languages/${lang.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="Delete">
		</form>
		<a href="/languages">Dashboard</a>
	</p>
	<form:form  action='/languages/${targetLang.id}' method='POST' modelAttribute="lang">
		<form:hidden path="id" value="${targetLang.id}"/>
        	<p>
        		<form:label path="name">Name</form:label>
				<form:errors path="name"/>
				<form:input path="name" value="${targetLang.name}" />
			</p>
			<p>
				<form:label path="creator">Creator</form:label>
				<form:errors path="creator"/>
				<form:input path="creator" value="${targetLang.creator}" />
			</p>
			<p>
				<form:label path="version">Version</form:label>
				<form:errors path="version"/>
				<form:input path="version" value="${targetLang.version}" />
			</p>
        	<input type="submit" value="Submit">
        </form:form>

</body>
</html>