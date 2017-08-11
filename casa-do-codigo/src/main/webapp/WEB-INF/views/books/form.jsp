<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Cadastro de Produtos</title>
</head>
<body>
	<div style="margin-left: 25%; margin-right: 25%">
			<form method="post" action="/casa-do-codigo/livro" >
				<div>
					<label for="title">Titulo</label> 
				</div>
				<div>
					<input class="form-control" type="text" name="title"	id="title" style="width: 100%"/>
				</div>
				<div>
					<label for="nome">Livro</label> 
				</div>		
				<div>
					<input class="form-control" type="text" name="name"	id="name" style="width: 100%"/>
				</div>
				<div>
					<label for="description">Descrição</label>
				</div>
				<div>
					<textarea rows="10" cols="20" name="description" id="description" style="width: 100%"></textarea>
				</div>
				<div>
					<label for="pages">Número de paginas</label> 
				</div>
				<div>
					<input type="text"	name="numberPages" id="numberPages" style="width: 100%"/>
				</div>
				<div>
					<label for="price">Preço R$</label> 
				</div>
				<div>
					<input type="text"	name="price" id="price" style="width: 100%"/>
				</div>
				<div>
					<c:forEach varStatus="status" items="${types}" var = "typeBook">
							<label for="price_${typeBook}">${typeBook.description}</label>
							<input type="text"      name="prices[${status.index}].price"	id="price_${typeBook}"/>
							<input type="hidden"	name="prices[${status.index}].typeBook"		value="${typeBook}"/>
					</c:forEach>
				</div>
				<div>
				
					<button type="submit" style="width: 100%">
						Cadastrar Produto
					</button>
				</div>
			</form>
	</div>
</body>
</html>