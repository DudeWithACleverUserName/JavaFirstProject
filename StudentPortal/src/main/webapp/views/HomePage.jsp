<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h1>Student Portal</h1>
<h3>Enter credentials below to generate Report Card</h3>
<br/>
<br/>

	<font color="red">${errorMessage}</font>
	<form method="post">
		Enter Roll Number: <input type="text" name="rollNo" /> <br/>
		<br/>
		<input type="submit" />
	</form>

</body>
</html>