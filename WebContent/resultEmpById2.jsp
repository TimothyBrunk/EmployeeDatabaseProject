<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
  <link rel="icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRopZtWL58-FuZutGY-IaFC-KRMbTIediMqw5EmyEjqCg5_5twmsA">

<title>Top Secret Research and Design</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/landing-page.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-fixed-top topnav"
		role="navigation">
		<div class="container topnav">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="http://timothybrunk.com">Timothy Brunk</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>


	<!-- Header -->
	<a name="about"></a>
	<div class="intro-header">
		<div class="container">

			<div class="row">
				<div class="col-lg-12">
					<div class="intro-message">
						<h1>Employee Results</h1>

						<hr class="intro-divider">
						<ul class="list-inline intro-social-buttons">
							<li>
								<form action="UpdateEmployee.do" method="POST">
									Employee ID: ${employee.eid} <br> First Name: <input
										id="idtext" type="text" name="firstname"
										value="${employee.firstName}" size="20"/> <br> <br> Last
									Name: <input id="idtext" type="text" name="lastname"
										value="${employee.lastName}" size="20" /> <br> <br> Dept. ID:
									<input id="idtext" type="text" name="departmentId"
										value="${employee.departmentId}" size="20" /> <br> <br> Job
									ID: <input id="idtext" type="text" name="jobId" 
										value="${employee.jobId}" /> <br> <br> Address: <input
										id="idtext" type="text" name="address"
										value="${employee.address}" /> City: <input id="idtext"
										type="text" name="city" value="${employee.city}" /> State: <input
										id="idtext" type="text" name="state" value="${employee.state}" />
									Zipcode: <input id="idtext" type="text" name="zipcode"
										value="${employee.zipcode}" /> <br> <input type="hidden"
										name="eid" value="${employee.eid}" /> <br> <input
										type="submit" value="Update Employee"
										class="btn btn-default btn-lg"><i
										class="fa fa-twitter fa-fw"></i> <span class="network-name"></span>
							</form>
							</li>
							<br>
							<br>
							
							<form action="DeleteEmployee.do" method="POST">
								<input type="hidden" name="eid" value="${employee.eid}"/>
								<input
									type="submit" name="delete" value="Delete Employee"
									onclick="return confirm('Are you sure you want to delete employee?')" class="btn btn-default btn-lg"><i
										class="fa fa-twitter fa-fw"></i> <span class="network-name"></span>
										
							</form>
							

						</ul>
					</div>
				</div>
			</div>

		</div>
		<!-- /.container -->

	</div>

</body>

</html>
