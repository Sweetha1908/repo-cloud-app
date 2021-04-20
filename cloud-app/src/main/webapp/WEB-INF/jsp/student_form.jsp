<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	    FirstName : <form:input path="firstName"/>
	<br> <br>
		LastName : <form:input path="lastName"/>
		<br><br>
		Country :
		<form:select path="country">
		<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		Favourite Language :
		
		Java<form:radiobutton path="favouriteLanguage" value="java"/>
		C<form:radiobutton path="favouriteLanguage" value="C"/>
		Python<form:radiobutton path="favouriteLanguage" value="Python"/>
		Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/>
		<br> <br>
		Operating System :
		
		Linux <form:checkbox path="operatingSystem" value="Linux"/>
		Mac Os <form:checkbox path="operatingSystem" value="Mac OS"/>
		Windows <form:checkbox path="operatingSystem" value="Windows"/>
		<br><br>
	<input type="submit" value="Submit"/>
	
	</form:form>
	
	

</body>
</html>