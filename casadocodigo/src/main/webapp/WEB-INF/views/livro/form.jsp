<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Produto</title>
<style type="text/css">
	.label-tipo-livro{
		text-transform: lowercase;
	}

</style>

<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> -->
<!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script> -->
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script> -->
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script> -->
	<link href="<c:url value='/static/bootstrap/css/bootstrap.css' />" rel="stylesheet"></link>
</head>
<body style="margin: 5px 0 5px 5px">

<%--    			<h3><span class="glyphicon glyphicon-log-in"></span>Cadastro de Livro</h3> --%>
      	 <div class="row">
			  <div class="col-sm-4">
			  	<form method="post" action="/casadocodigo/livro">
				       <div class="form-group">
					        <label for="input-titulo">Titulo</label>
					        <input type="text" id="input-titulo" name = "titulo" class="form-control" placeholder="Titulo do Livro" autofocus/>
						        <span class="alert alert-success">
							        <form:errors path="livro.titulo"/>
								</span>
					        
				       </div> 
				       <div class="form-group">
				       	 <label for="input-descricao" >Descrição</label>
				        	<textarea rows="3" id="input-descricao" name = "descricao" class="form-control" placeholder="Descrição do Livro" autofocus></textarea>
				        </div>
				        <div class="form-group">
					        <label for="input-paginas" >Número Páginas</label>
					        <input type="text" id="input-paginas" name = "numeroPaginas" class="form-control" placeholder="Número de Páginas" autofocus>
				       </div> 
				       
			        	<c:forEach items="${types}" var="tipoLivro" varStatus="status">
					       <div class="form-group">
					        	<label class="label-tipo-livro">${tipoLivro}</label>
					        	<input type="text" name="precos[${status.index}].preco" class="form-control"/>
					        	<input type="hidden" name = "precos[${status.index}].tipoLivro" value = "${tipoLivro}" class="form-control"/>
					       </div>
					    </c:forEach>
				        <button class="btn btn-block btn-primary" type="submit">Salvar Livro</button>
		 		  </form>
			  </div>
		  
		</div>
</body>
</html>