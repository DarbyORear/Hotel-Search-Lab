<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Results Page</title>
</head>
<body>
<h1>Congrats! There are hotels available in ${city}.</h1>

 
<table>
	<thead>
		<th>City</th><th>Name</th><th>Price Per Night</th>
	</thead>
				<tbody>
				<c:forEach var="hotel" items="${hotels}">
					
				<tr>
					<td>${hotel.city}</td>
					<td>${hotel.name}</td>
					<td>${hotel.pricePerNight}</td>
				</tr>

				</c:forEach>
			</tbody>

</table>



<!-- I want to display different results depending on which city the person chooses.
Can I do that in one jsp? -->

<!-- Detroit results: -->

<!-- Ann Arbor results: -->

<!-- Grand Rapids results: -->

<!-- Luzerne results: -->



<a href = "/goback">Back</a>
</body>
</html>