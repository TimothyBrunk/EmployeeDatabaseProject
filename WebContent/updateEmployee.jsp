<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRopZtWL58-FuZutGY-IaFC-KRMbTIediMqw5EmyEjqCg5_5twmsA">
<title>Insert title here</title>
</head>
<body>
<form action="toUpdatePage" method="POST">
	<br>
	First Name: <input type="text" name="${employee.firstName}" value="" /> <br> 
	Last Name: <input type="text" name="${employee.lastName}" value="" /> <br> 
	Dept. ID: <input type="text" name="${employee.departmentId}" value="" /><br> 
	Job ID: <input type="text" name="${employee.jobId}" value="" /> <br> 
	Address: <br> 
	Street: <input type="text" name="${employee.address}" value="" /> <br> 
	City: <input type="text" name="${employee.city}" value="" /> <br> 
	State: <input type="text" name="${employee.state}" value="" /><br> 
	Zipcode: <input type="text" name="${employee.zipcode}" value="" /> <br>
	
	<input type="submit" value="Add Employee" />
</form>

	<br>
</form>


</body>
</html>