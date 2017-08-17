<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<style type="text/css">
		body {
			margin: 1%;
		}
	
	</style>
<title>Cadastro de Produtos</title>
</head>
<body>
	<div style="margin-left: 25%; margin-right: 25%">
			<spring:hasBindErrors name="book">
				<c:forEach items="${errors.allErrors}" var = "error">
					<spring:message code="${error.code}" text=""/>
				</c:forEach>
			</spring:hasBindErrors>

			<form method="post" action="/casa-do-codigo/livros" >
				<div class="form-group">
					<label for="title">Titulo</label> 
					<input class="form-control" type="text" name="title"	id="title" />
				</div>
				<div class="form-group">
					<label for="nome">Livro</label> 
					<input class="form-control" type="text" name="name"	id="name" />
				</div>
				<div class="form-group">
					<label for="description">Descrição</label>
					<textarea class ="form-control" rows="10" cols="20" name="description" id="description" ></textarea>
				</div>
				<div class="form-group">
					<label for="pages">Número de paginas</label> 
					<input class ="form-control" type="text"	name="numberPages" id="numberPages" />
				</div>
					<c:forEach varStatus="status" items="${types}" var = "typeBook">
						<div class="form-group">
							<label for="price_${typeBook}">${typeBook.description}</label>
							<input class ="form-control" type="text"      name="prices[${status.index}].price"	id="price_${typeBook}" />
							<input type="hidden"	name="prices[${status.index}].typeBook"		value="${typeBook}"/>
						</div>
					</c:forEach>
					<button class =" btn btn-primary btn-block" type="submit">
						Salvar Produto
					</button>
			</form>
	</div>
</body>
</html>