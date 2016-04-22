<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AddEmployee.do" method="POST">
	<br>
	First Name: <input type="text" name="firstname" value="" /> <br> 
	Last Name: <input type="text" name="lastname" value="" /> <br> 
	Dept. ID: <input type="text" name="departmentId" value="" /><br> 
	Job ID: <input type="text" name="jobId" value="" /> <br> 
	Address: <br> 
	Street: <input type="text" name="address" value="" /> <br> 
	City: <input type="text" name="city" value="" /> <br> 
	State: <input type="text" name="state" value="" /><br> 
	Zipcode: <input type="text" name="zipcode" value="" /> <br>
	
	<input type="submit" value="Add Employee" />
</form>

	<br>
</form>


</body>
</html>