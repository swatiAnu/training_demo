<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head><title>Student Registration Form </title></head>
	<body>
	
	<!-- modelAttribute's value should be equal to  StudentController's class model obj.'s addAttribute 1st parameter -->
	<!-- here path's value ( in line 14 and 16)  is the property of java Student's class bcz we hv getter setter for this property -->
	
	<form:form action="processForm" modelAttribute="student">	
		First Name:<form:input path="firstName"/>
		<br><br>
		Last Name:<form:input path="lastName"/>
		<br><br>
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		
		</form:select>
		<br><br>
		Favorite Language:
		C <form:radiobutton path="favoriteLanguage" value="C"/>
		C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		<br><br>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac <form:checkbox path="operatingSystems" value="Mac"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		
		<br><br>
		<input type="submit"/>
	
	</form:form>

	</body>





</html>