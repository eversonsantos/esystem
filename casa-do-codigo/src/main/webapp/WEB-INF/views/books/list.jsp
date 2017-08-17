<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Lista de Produtos</title>
<style type="text/css">
	
	
	table > thead > tr > td {
		font-family: monospace;
		font-weight: bold;
		font-size: 16px;
	}
	td {
		text-align: center;
	}
	.div-price {
		text-align: left;
		text-transform: lowercase;
	}
	.div-content {
		margin-left: 25%; 
		margin-right: 25%
	}
	.td-price{
		width: 20%;
	}
	h1 {
		color: blue;
	}
	body {
		margin: 1%;
	}
</style>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h4>
				<span class="glyphicons glyphicons-book">Lista de Livros</span>
			</h4>
		</div>
		<div class="panel-body">
				<div class="table-responsive">
					<div class="alert alert-success">
					  	${sucesso}
					</div>
					<table class = "table table-hover">
						<thead>
							<tr>
								<td>Name</td>
								<td>Title</td>
								<td>Description</td>
								<td>Number Pages</td>
								<td>Prices</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach varStatus="status" items="${livros}" var="livro">
								<tr>
									<td>${livro.name}</td>
									<td>${livro.title}</td>
									<td>${livro.description}</td>
									<td>${livro.numberPages}</td>
									<td class="td-price">
										<c:forEach items="${livro.prices}" var="price">
											<div class="div-price">
												${price.typeBook} : ${price.price}
											</div>
										</c:forEach>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
		</div>
	</div>
</body>
</html>