<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Produtos</title>
</head>
<body>
	<form method="post" action="/casa-do-codigo/livro" >
		<div>
			<label for="title">Titulo</label> <input class="form-control" type="text" name="title"	id="title" />
		</div>
		<div>
			<label for="nome">Nome</label> <input class="form-control" type="text" name="name"	id="name" />
		</div>
		<div>
			<label for="description">Descrição</label>
			<textarea rows="10" cols="20" name="description" id="description"></textarea>
		</div>
		<div>
			<label for="pages">Número de paginas</label> <input type="text"	name="numberPages" id="numberPages" />
		</div>
		<div>
			<label for="price">Preço R$</label> <input type="text"	name="price" id="price" />
		</div>
		<div>
			<input type="submit" value="Enviar">
		</div>
	</form>
</body>
</html>