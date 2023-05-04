<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@page import="com.learn.mycart.helper.FactoryProvider"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyCart</title>

<%@include file="components/common_css_js.jsp" %>

</head>
<body>

<%@include file="components/navbar.jsp" %>

<h2>Hello World!</h2>
<h1>Hi let's begin our 1st project</h1>
<h2>Creating session factory object</h2>

<%out.println(FactoryProvider.getFactory());%><br>
<%out.println(FactoryProvider.getFactory());%><br>
<%out.println(FactoryProvider.getFactory());%>

</body>
</html>
