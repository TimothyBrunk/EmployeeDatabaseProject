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
<form action="AddEmployee.do" method="POST">
	<br>
	First Name: <input type="text" name="firstname" required value="" /> <br> 
	Last Name: <input type="text" name="lastname" required value=""  /> <br> 
	Dept. ID: <select name="departmentId" >
			<option value="1">Research</option>
			<option value="2">Administration</option>
			<option value="3">Software Development</option>
			<option value="4">Hardware Development</option>
			<option value="5">Test And Integration</option>
			<option value="6">Sales</option>
			<option value="7">HR</option>
			<option value="8">Facilities</option>
			<option value="9">Operations</option>
			<option value="10">Documentation</option>
			</select>
	<br> 
	Job ID: <select name="jobId">
			<option value="1">President</option>
			<option value="2">Vice President</option>
			<option value="3">Director</option>
			<option value="4">Manager</option>
			<option value="5">Supervisor</option>
			<option value="6">Administrative Assistant</option>
			<option value="7">Secretary</option>
			<option value="8">Lead Engineer</option>
			<option value="9">Engineer</option>
			<option value="10">Junior Engineer</option>
			<option value="11">Database Administrator</option>
			<option value="12">Database Operator</option>
			<option value="13">Systems Administrator</option>
			<option value="14">Systems Operator</option>
			<option value="15">Data Analyst</option>
			<option value="16">Project Lead</option>
			<option value="17">Senior Developer</option>
			<option value="18">Developer</option>
			<option value="19">Junior Developer</option>
			<option value="20">Product Evangelist</option>
			<option value="21">Senior Sales Rep</option>
			<option value="22">Account Rep</option>
			<option value="23">Sales Rep</option>
			<option value="24">Tester</option>
			<option value="25">Receptionist</option>
			<option value="26">Data Entry Clerk</option>
			<option value="27">Technical Writer</option>
			<option value="28">Trainer</option>
			<option value="29">COO</option>
			<option value="30">CFO</option>
			<option value="31">CIO</option>
			<option value="32">Test Designer</option>
			</select>
	 <br> 
	Address: <br> 
	Street: <input type="text" name="address" value="" /> <br> 
	City: <input type="text" name="city" value="" /> <br> 
	State: <input type="text" name="state" value="" /><br> 
	Zipcode: <input type="text" name="zipcode" value="" /> <br>
	<br>
	<input type="submit" value="Add Employee" />
</form>

	<br>
</form>
<a href="index.html" > <input type="submit"  value=" Home "/> 


</body>
</html>