<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyCart -Registration</title>
<%@include file="components/common_css_js.jsp"%>

</head>
<body>
	<%@include file="components/navbar.jsp"%>

	<div class="container-fluid">

		<div class="row mt-0 mb-3 ">
			<div class="col-md-4 offset-md-4">

				<div class="card element-shadow">
					<div class="card-header mycart-bg">
						<h3 class="text-center">Registration!!!</h3>

					</div>
					<%@include file="components/message.jsp"%>
					<div class="card-body px-4">

						<form action="registerServlet" method="post">

							<div class="mb-3">
								<label for="userName" class="form-label">User Name</label> <input
									type="text" name="user_name" class="form-control" id="userName"
									required>
							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									address</label> <input type="email" name="user_email"
									class="form-control" id="userEmail"
									aria-describedby="emailHelp" required>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" name="user_password" class="form-control"
									id="exampleInputPassword1" required>
							</div>

							<div class="mb-3">
								<label for="userPhone" class="form-label">Phone number</label> <input
									type="number" name="user_phone" class="form-control"
									id="userPhone" required>
							</div>

							<div class="mb-3">
								<label for="userAddress">User Address</label>
								<textarea style="height: 120px;" name="user_address"
									id="userAddress" class="form-control"
									placeholder="Enter your address" required></textarea>
							</div>

							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Accept T&C</label>
							</div>
							<a href="login.jsp">Already registered? Login here</a>
							<div class="container text-center mt-2">
								<button class="btn btn-primary mycart-btn">Register</button>
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