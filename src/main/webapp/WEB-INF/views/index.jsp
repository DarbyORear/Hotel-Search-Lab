<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Hotel Search</h1>

<form action="/results">
<select name="city">
  <option value="Detroit">Detroit</option>
  <option value="Ann Arbor">Ann Arbor</option>
  <option value="Grand Rapids">Grand Rapids</option>
  <option value="Luzerne">Luzerne</option>
  <option value="all">View All</option>
  
</select>
<input type="submit" value="Submit">
</form>


</body>
</html>