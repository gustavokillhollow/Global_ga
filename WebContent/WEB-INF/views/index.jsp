
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/static/css/bootstrap.css" var="css" />

<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${css}">
</head>
<body>
<div class="container" >


   <h1>Global Games</h1>
  <ul class="list-group">
	<Li class="list-group-item" > <a  href = "http://192.168.1.9:8080/Global_Games/cadastrocliente"> Cadastrar Cliente </a > </li >
	<Li class="list-group-item" > <a  href = "http://192.168.1.9:8080/Global_Games/cadastrojogo"> Cadastrar Jogo </a > </li >
	<Li class="list-group-item" > <a  href = "http://192.168.1.9:8080/Global_Games/cadastrolocacao"> Nova Locações </a > </li >
</ul >
</div>
</body>
</html>
