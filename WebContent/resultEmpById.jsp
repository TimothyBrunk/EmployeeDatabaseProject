<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="result.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Results of Your Query: </h3>

	Employee ID:  ${employee.eid} <br> First Name: ${employee.firstName} <br> Last Name: ${employee.lastName} <br>
	 Dept. ID: ${employee.departmentId} Job ID: ${employee.jobId} <br> 
	Address: ${employee.address} , ${employee.city} , ${employee.state} , ${employee.zipcode}
	
	
	
</body>
</html>