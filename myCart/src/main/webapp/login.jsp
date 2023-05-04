<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyCart -Login</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>

	<div class="container">
		<div class="row">
			<div class=" col-md-4 offset-md-4">
				<div class="card mycart-form-shadow">
					<div class="card-header mycart-bg text-center">
						<h3>User Login !!!</h3>
					</div>
					
					<div class="card-body px-4">

						<form action="loginServlet" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email address</label>
							    <input name="user_email" type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input name="user_password" type="password" class="form-control"
									id="exampleInputPassword1">
							</div>
							<a href="register.jsp">New user? Register here</a>
							<div class="container text-center mt-2">
								<button type="submit" class="text-center mycart-btn btn btn-primary">Login</button>
								<button class="btn btn-outline-warning">Reset</button>
									
							</div>
						</form>

					</div>


				</div>
			</div>
		</div>
	</div>

</body>
</html>