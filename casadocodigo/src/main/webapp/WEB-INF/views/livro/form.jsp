<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Produto</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</head>
<body>

	<div class="container" style="width: 25%; margin-top: 1%">
	      <form>
	      		<div class = "alert alert-secondary" role="alert">
	      			<h2 class="glyphicon glyphicon-log-in">Cadastro de Livro</h2>
	      		</div>
		       <div class="form-group">
			        <label for="input-titulo" class="sr-only">Titúlo</label>
			        <input type="text" id="input-titulo" class="form-control" placeholder="Titúlo do Livro" required autofocus>
		       </div> 
		       <div class="form-group">
		       	 <label for="input-descricao" class="sr-only">Descrição</label>
		        	<textarea rows="3" id="input-descricao" class="form-control" placeholder="Descrição do Livro" required autofocus></textarea>
		        </div>
		        <div class="form-group">
			        <label for="input-paginas" class="sr-only">Número Páginas</label>
			        <input type="text" id="input-paginas" class="form-control" placeholder="Número de Páginas" required autofocus>
		       </div> 
		        <button class="btn btn-lg btn-outline-primary btn-block" type="submit">Salvar Livro</button>
		   </form>
	
	 </div>
</body>
</html>