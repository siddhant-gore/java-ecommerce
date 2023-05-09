<%@page import="com.learn.mycart.entities.User" %>
<%
		User user1 = (User)session.getAttribute("current-user");
%>

<nav class="element-shadow navbar-expand-lg navbar-dark navbar mb-3 bg-body-tertiary mycart-bg">
  
  
  <div class="container">
    <a class="navbar-brand" href="index.jsp">MyCart</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Categories
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
      </ul>      
    </div>
    
    <%
    
    if(user1 == null){
    
    %>
    
    <ul class="navbar-nav ml-auto">
      	<li class="nav-item active">
      		<a class="nav-link active" href="login.jsp">Login</a>
      	</li>
      	<li class="nav-item active">
      		<a class="nav-link active" href="register.jsp">Register</a>
      	</li>
      	      
      </ul>
    
    
    <%	
    	
    }
    
    
    
    
    
    else{
    	
    %>
    <ul class="navbar-nav ml-auto">
      	<li class="nav-item active">
      		<a class="nav-link" href="#!"><%= user1.getUserName() %></a>
      	</li>
      	<li class="nav-item active">
      		<a class="nav-link" href="logoutServlet">Logout</a>
      	</li>
      	      
      </ul>
    
    
    <%	
    	
    	
    }
    
    
    
    %>
    
  </div>
  
  
</nav>

