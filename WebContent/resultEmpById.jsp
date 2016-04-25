<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="result.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRopZtWL58-FuZutGY-IaFC-KRMbTIediMqw5EmyEjqCg5_5twmsA">
<title>Insert title here</title>
</head>
<body>
	<h3>Employee Detail:</h3>
<form action="UpdateEmployee.do" method="POST">
	Employee ID: ${employee.eid}
	<br> First Name:
	<input type="text" name ="firstname" value="${employee.firstName}" />
	<br> Last Name:
	<input type="text" name="lastname"value="${employee.lastName}" />
	<br> Dept. ID:
	<input type="text" name="departmentId" value="${employee.departmentId}" /> Job ID:
	<input type="text" name="jobId" value="${employee.jobId}" />
	<br> Address:
	<input type="text" name="address" value="${employee.address}" /> 
	City: <input type="text" name="city" value="${employee.city}" />
	State: <input type="text" name="state" value="${employee.state}" />
	Zipcode: <input type="text" name="zipcode"  value="${employee.zipcode}" />
	<br>	
		<input type="hidden" name="eid" value="${employee.eid}" /> <input
			type="submit" value="Update Employee" />
	</form>
	<br>
	<br>
	<form action="DeleteEmployee.do" method="POST">
		<input type="text" name="id" value="${employee.eid}" /> <input
			type="submit" name="delete" value="Delete Employee"
			onclick="return confirm('Are you sure you want to rollback deletion of candidate table?')" />
	</form>
	<br>




</body>
</html>