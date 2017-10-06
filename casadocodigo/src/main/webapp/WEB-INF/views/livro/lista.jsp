<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Livros</title>
<link href="<c:url value='/static/bootstrap/css/bootstrap.css' />" rel="stylesheet"></link>
</head>
<body>
		<div class="alert alert-success">
			<strong>Success!</strong> ${sucesso}
		</div>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>#</th>
		      <th>Titulo</th>
		      <th>Descrição</th>
		      <th>Nº Paginas</th>
		      <th>Preços</th>
		    </tr>
		  </thead>
		  <tbody>
			  <c:forEach var="livro" items="${livros}">
				    <tr>
				      <td>${livro.id}</td>
				      <td>${livro.titulo}</td>
				      <td>${livro.descricao}</td>
				      <td>${livro.numeroPaginas}</td>
					 <td>
				     	 <c:forEach items="${livro.precos}" var="preco">
							[${preco.tipoLivro.description} ${preco.preco}]
				      	</c:forEach>
					</td>
				    </tr>
			  </c:forEach>
		  </tbody>
		</table>
</body>
</html>