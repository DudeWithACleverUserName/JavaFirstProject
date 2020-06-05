<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Result</title>
<style>
h4{
display: inline;
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
 
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body>



<h1>${name}'s Report Card</h1>
<br/>

<table>
  <tr>
    <th>Roll Number</th>
    <th>Name</th>
    <th>Marks Obtained</th>
    <th>Grade</th>
  </tr>
  <tr>
    <td>${rollNo}</td>
    <td>${name}</td>
    <td>${marks}</td>
    <td>${grade}</td>
  </tr>
  
</table>
<br/><br/>
<a href="/">Back to Portal</a>



</body>
</html>