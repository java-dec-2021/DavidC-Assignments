<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
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
        <table>
        	<thead>
	        	<tr>
	        		<th>Name</th>
	        		<th>Creator</th>
	        		<th>Version</th>
	        		<th>Action</th>
	        	</tr>
        	</thead>
        	<tbody>
        		<c:forEach items="${languages}" var="lang">
	        	<tr>
	            	<td><a href="/languages/${lang.id}"><c:out value="${lang.name}"/></a></td>
	            	<td><c:out value="${lang.creator}"/></td>
	            	<td><c:out value="${lang.version}"/></td>
	            	<td>
	            		<a href="/languages/${lang.id}/edit">edit</a>
	            		<form action="/languages/${lang.id}" method="post">
	            			<input type="hidden" name="_method" value="delete">
	            			<input type="submit" value="Delete">
	            		</form>
	            	</td>
	            </tr>
	            </c:forEach>
            </tbody>
        </table>
        <form:form  action='/languages' method='POST' modelAttribute="lang">
        	<p>
        		<form:label path="name">Name</form:label>
				<form:errors path="name"/>
				<form:input path="name"/>
			</p>
			<p>
				<form:label path="creator">Creator</form:label>
				<form:errors path="creator"/>
				<form:input path="creator"/>
			</p>
			<p>
				<form:label path="version">Version</form:label>
				<form:errors path="version"/>
				<form:input path="version"/>
			</p>
        	<input type="submit" value="Submit">
        </form:form>
     </div>
</body>
</html>