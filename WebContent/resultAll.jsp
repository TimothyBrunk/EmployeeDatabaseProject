<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css.css">
  <link rel="icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRopZtWL58-FuZutGY-IaFC-KRMbTIediMqw5EmyEjqCg5_5twmsA">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<h3>Search Company Database</h3>
</head>
<body>
<a href="index.jsp" > <input type="submit"  value=" Home "/> </a>
	<br>
</form>
	<table border ="1" width="100%">
		<c:forEach var="items" items="${response}">
			<tr class="row">
				<c:forEach var="items2" items="${items}">
					<td>${items2}</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>

</body>
</html>