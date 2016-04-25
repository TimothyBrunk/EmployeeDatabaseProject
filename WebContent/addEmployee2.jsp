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
					<li>
                        <a href="About.jsp">About</a>
                    </li>
                    <li>
                        <a href="MyGrade.jsp">My Grade</a>
                    </li>
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
						<h1>Add New Employee</h1>

						<hr class="intro-divider">
						<ul class="list-inline intro-social-buttons">
							<li>
								<form id = "addtext" action="AddEmployee.do" method="POST">
									First Name: <input type="text" name="firstname" required value="" placeholder="Enter First Name"/> 
										<br>
										 <br> 
										Last Name: <input type="text" name="lastname" required value="" placeholder="Enter Last Name"/> 
										<br> <br>
									Dept. ID: <select name="departmentId" required >
										<option value="" disabled selected>Select Department ID</option>
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
									</select> Job ID: <select name="jobId" required>
										<option value="" disabled selected>Select Job ID</option>
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
									<br>
									Address: <input id="idtext" type="text"
										name="address" value="${employee.address}" /> City: <input
										id="idtext" type="text" name="city" value="${employee.city}" />
									State: <input id="idtext" type="text" name="state"
										value="${employee.state}" /> Zipcode: <input id="idtext"
										type="text" name="zipcode" value="${employee.zipcode}" /> <br>
									<input type="hidden" name="eid" value="${employee.eid}" /> <br>
									<input type="submit" value="Add Employee"
										class="btn btn-default btn-lg"><i
										class="fa fa-twitter fa-fw"></i> <span class="network-name"></span>
								</form>
							</li>




						</ul>
					</div>
				</div>
			</div>

		</div>
		<!-- /.container -->

	</div>

</body>

</html>
