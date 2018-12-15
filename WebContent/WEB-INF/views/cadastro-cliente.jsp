<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/static/css/bootstrap.css" var="css" />
<link type="text/css" rel="stylesheet" href="${css}">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container" >

	<form action="http://192.168.1.9:8080/Global_Games/cadastrocliente/novo" method="get"  >
		<h3>Cadastro Ciente</h3>
		<h4>Nome:</h4>
		<input class="form-control" name="nome" type="text"/>

		<h4>Cpf:</h4>
		<input  class="form-control" name="cpf" type="text"/>

		<input type="submit" value="Salvar">
	</form>
</div>
</body>
</html>