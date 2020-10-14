<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head><title>Student Confirmation Page </title></head>
	<body>
	
	<!-- student.firstName will call student.getFirstName() -->
	The student: ${student.firstName} ${student.lastName} is confirmed
	<br><br>	
	Country selected by student:${student.country}
	<br>
	Favorite Language:${student.favoriteLanguage}
	<br>
	Operating Systems:
	
	<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	</c:forEach>
	<li> ${temp}</li>
	
	</ul>
	</body>
</html>