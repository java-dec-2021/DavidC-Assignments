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
		<form class="formContainer" method="POST" action="/survey">
			<div class="formRow">
				<label class="form-label" for='name'>Name</label>
				<input type='text' name='name'>
			</div>
            <div  class="formRow">
				<label class="form-label" for="location">Dojo Location:</label>
            	<select name="location">
            		<option value="Chicago">Chicago</option>
            		<option value="Seattle">Seattle</option>
            		<option value="Online">Online</option>
            		<option value="Burbank">Burbank</option>
                	<option value="Bellevue">Bellevue</option>
           		</select>
           	</div>
            <div  class="formRow">
				<label class="form-label" for="favoriteLanguage">Favorite Language:</label>
            	<select name="favoriteLanguage">
            		<option value="JAVA">JAVA</option>
            		<option value="HTML">HTML</option>
            		<option value="CSS">CSS</option>
            		<option value="JavaScript">JavaScript</option>
            		<option value="Python">Python</option>
            		<option value="C#">C#</option>
            	</select>
           	</div>
            <label for="comment">Comment:</label>
            <textarea name="comment" rows="4" cols="50"></textarea>
            <button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>