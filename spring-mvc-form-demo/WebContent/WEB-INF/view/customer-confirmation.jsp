<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head><title>Customer Confirmation Page </title></head>
	<body>
	The customer is confirmed:${customer.firstName} ${customer.lastName}
	<br><br>
	The free passes ${customer.firstName} have  ${customer.freePasses} 
	<br><br>
	The  postalCode :${customer.postalCode} 
	<br><br>
	The  courseCode :${customer.courseCode} 
	</body>
</html>