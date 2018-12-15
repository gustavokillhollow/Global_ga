<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/static/css/bootstrap.css" var="css" />

<!DOCTYPE html>
<html>
<head>
	<link type="text/css" rel="stylesheet" href="${css}">
	<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://192.168.1.9:8080/Global_Games/cadastrojogo/novo" method="get" >

	<div class="container" >
	<h3>Cadastro Jogo</h3>
		<h4>Título:</h4>
		<input class="form-control" name ="titulo" type="text">
		
		<h4>Classificação Indicativa:</h4>
		<input class="form-control" name ="classIndicativa" type="number">
		
		<h4>Gênero:</h4>
		<input class="form-control" name ="genero" type="text">

		<h4>Preço Dia:</h4>
		<input class="form-control button" name ="preco" type="number"> <input type="submit" value="Salvar">
	</form>
</div>
</body>
</html>