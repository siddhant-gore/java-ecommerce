<%@page import="com.learn.mycart.entities.User"%>
<%@page import="com.learn.mycart.dao.CategoryDao" %>
<%@page import="com.learn.mycart.entities.Category"%>
<%@page import="com.learn.mycart.helper.FactoryProvider" %>
<%@page import="java.util.List" %>
<%
	User user = (User) session.getAttribute("current-user");
	if (user == null) {
		session.setAttribute("message", "You are not logged in !! Please Login");
		response.sendRedirect("login.jsp");
		return;
	} else {
		if (user.getUserType().equals("normal")) {
			session.setAttribute("message", "User is Not Authorized to Access Admin Panel");
			response.sendRedirect("login.jsp");
			return;
		}
	}
%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="components/common_css_js.jsp"%>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<%@include file="/components/navbar.jsp"%>
	<h1>Admin</h1>

	<div class="container admin">

		<div class="container-fluid">
			<%@include file="components/message.jsp"%>
		</div>

		<div class="row">
			<!-- first col -->
			<div class="col-md-4 ">
				<div class="card ">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 100px;" class="img-fluid"
								src="img/all users.png" alt="users">
						</div>
						<h1>2342</h1>
						<h1 class="text-muted">USERS</h1>
					</div>

				</div>

			</div>

			<!-- second col -->
			<div class="col-md-4">

				<div class="card">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 100px;" class="img-fluid"
								src="img/categories.png" alt="categories">
						</div>
						<h1>23</h1>
						<h1 class="text-muted">CATEGORIES</h1>
					</div>

				</div>

			</div>

			<!-- third col -->
			<div class="col-md-4">

				<div class="card">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 100px;" class="img-fluid"
								src="img/products.png" alt="products">
						</div>
						<h1>151</h1>
						<h1 class="text-muted">PRODUCTS</h1>
					</div>

				</div>

			</div>


		</div>
		<!-- First row end -->

		<!-- second row start -->
		<div class="row mt-3">

			<!-- second row 1st col -->
			<div class="col-md-6">
				<div class="card" data-bs-toggle="modal"
					data-bs-target="#add-category-modal">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 100px;" class="img-fluid"
								src="img/add category.png" alt="products">
						</div>
						<h1>151</h1>
						<h1 class="text-muted">ADD CATEGORY</h1>
					</div>

				</div>

			</div>
			<!-- second row 2nd col -->
			<div class="col-md-6">
				<div class="card" data-bs-toggle="modal"
					data-bs-target="#add-product-modal">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 100px;" class="img-fluid"
								src="img/add product.png" alt="products">
						</div>
						<h1>151</h1>
						<h1 class="text-muted">ADD PRODUCTS</h1>
					</div>

				</div>

			</div>

		</div>




	</div>

	<!-- add category modal starts-->


	<!-- Modal -->
	<div class="modal fade" id="add-category-modal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header mycart-bg">
					<h1 class="modal-title fs-5" id="exampleModalLabel">ADD
						CATEGORY</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">

					<form action="productOperationServlet" method="post">

						<input type="hidden" name="operation" value="addCategory">

						<div class="form-group mb-2">
						 <label for="cTitle">Category Title</label>
							<input id="cTitle" type="text" class="form-control" name="catTitle"
								placeholder="Enter category title" required />

						</div>

						<div class="form-group">
							<label for="cDesc">Category Description</label>
							<textarea id="cDesc" style="height: 300px" class="form-control"
								name="catDescription" placeholder="Enter Category discription"
								required></textarea>

						</div>
						<div class="container text-center">
							<button class="btn btn-outline-success m-2">Add Category
							</button>
							<button type="button" class="btn btn-secondary"
								data-bs-dismiss="modal">Close</button>
						</div>

					</form>


				</div>

			</div>
		</div>
	</div>

	<!-- add category modal ends-->

	<!-- add product modal starts -->

	<!-- Button trigger modal -->


	<!-- Modal -->
	<div class="modal fade" id="add-product-modal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header mycart-bg">
					<h1 class="modal-title fs-5" id="exampleModalLabel">ADD
						PRODUCT</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">

					<!-- form start -->
					<form action="productOperationServlet" method="post" enctype="multipart/form-data">
					
						<input type="hidden" name="operation" value="addProduct">

						<!-- product title -->
						<div class="form-group">
							
							<label for="pName">Product Title:</label>
							<input type="text" id="pName" class="form-control"
								placeholder="Enter product title" name="pName" required>
						
						</div>

						<!-- product description -->

						<div class="form-group">
							<label for="pDesc">Product Description:</label>
							<textarea id="pDesc" style="height: 150px;" class="form-control"
								placeholder="Enter product description" name="pDesc"></textarea>

						</div>

						<!-- product price -->
						<div class="form-group">
						<label for="pPrice">Product Price:</label>
							<input id="pPrice" type="number" class="form-control"
								placeholder="Enter product price" name="pPrice" required>
						</div>
						<!-- product discount -->
						<div class="form-group">
						 <label for="pDiscount">Product Discount:</label>
							<input id="pDiscount" type="number" class="form-control"
								placeholder="Enter product discount" name="pDiscount" required>
						</div>

						<!-- product quantity -->
						
										
						
						<div class="form-group">
						 <label for="pQuantity">Product Quantity:</label>
							<input id="pQuantity" type="number" class="form-control"
								placeholder="Enter product quantity" name="pQuantity" required>
						</div>

						<!-- product category -->
						<%
						
						CategoryDao cdao = new CategoryDao(FactoryProvider.getFactory());
						List<Category> list=cdao.getCategories();
						
						%>
						
						<div class="form-group">
						 <label for="pCat">Product Category:</label>
							<select id="pCat" name="catId" class="form-control" required>
							<% for(Category c: list){
							%>
								<option value="<%=c.getCategoryId() %>"><%=c.getCategoryTitle() %></option>
								
							<%} %>
							</select>
						</div>

						<!-- product pic -->

						<div class="form-group">
							<label for="pPic">Select product pic</label>
							 <br>
							  <input type="file" id="pPic" name="pPic" required>
						</div>

						<div class="container text-center mt-2">

							<button class="btn btn-outline-success m-2">Add product</button>
							<button type="button" class="btn btn-secondary"
								data-bs-dismiss="modal">Close</button>

						</div>

					</form>
					<!-- form end -->

				</div>

			</div>
		</div>
	</div>

	<!-- add product modal ends -->


</body>
</html>