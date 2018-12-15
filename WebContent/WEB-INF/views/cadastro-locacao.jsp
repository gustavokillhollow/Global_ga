<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<h3>Locação</h3>
		<h4>Cliente:</h4>
		<select>
			<c:forEach var="cliente" items="${clientes}">
			<option value="${cliente.id}">${cliente.nome}</option>
			</c:forEach>
		</select>

		<h4>Jogo:</h4>
		<select>
			<c:forEach var="jogo" items="${jogos}">
			<option value="${jogo.id}">${jogo.titulo}</option>
			</c:forEach>
		</select>

		<h4>Dias:</h4>
		<input type="number"><input
			type="submit" value="Salvar">
	</form>
</body>
</html>