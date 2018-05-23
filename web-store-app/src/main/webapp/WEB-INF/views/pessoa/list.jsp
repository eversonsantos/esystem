<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sweet Dreams - Home</title>
	<c:set var="path" value="${pageContext.request.contextPath}"/>
	<%@ include file="/WEB-INF/views/tags/importscss.jsp"%>
</head>
<body class="hold-transition skin-blue sidebar-mini">

	<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="${path}/home" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>S</b>D</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Sweet</b>Dreams</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>

       <%@ include file="/WEB-INF/views/tags/user.jsp"%>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- sidebar menu: : style can be found in sidebar.less -->
      	<%@ include file="/WEB-INF/views/tags/menu.jsp"%>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Lista Cadastros
      </h1>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Main row -->
      <div class="row">
      	<div class="col-md-12">	
	      	<div class="col-xs-3">
				<div class="box">
		           <div class="box-header">
		             <h3 class="box-title">Filtros para pesquisa</h3>
						<form role="form">
							<div class="box-body">
								<div class="form-group">
									<label for="nome">Nome</label> <input type="text"
										class="form-control input-sm" id="nome" placeholder="Digite seu nome">
								</div>
								<div class="box-footer">
									<a href="#" class="btn btn-block btn-social btn-default">
										<i class="fa  fa-lg fa-search"></i>
									Pesquisar Cadastro</a>
								</div>
							</div>
							<!-- /.box-body -->
						</form>
					</div>
				</div>	
			</div>
	       <div class="col-xs-9">
	         <div class="box">
	           <div class="box-header">
	             <h3 class="box-title">Lista Cadastros</h3>
	
	             <div class="box-tools">
	               <div class="input-group" style="width: 150px;">
	                <div class="input-group-btn">
	                  <a href="${path}/pessoa/cadastro" class="btn btn-block btn-default"><i class="fa fa-lg fa-user-plus"></i>Adicionar Cadastro</a>
	                </div>
	              </div>
	            </div>
	          </div>
	          <!-- /.box-header -->
	          <div class="box-body">
	              <table class="table table-bordered table-striped">
	                <tr>
	                  <th style="width: 10px">#</th>
					  <th>CPF/CNPJ</th>
	                  <th>Pessoa</th>
	                  <th>Nº RG</th>
	                  <th>Tipo Pessoa</th>
	                  <th>CEP</th>
	                  <th style="width: 40px">Opções</th>
	                </tr>
	               	<c:forEach items="${pessoas}" var="pessoa">
		                <tr>
	                 		<td>
	                 			<a href="#">
									<i class="fa fa-search-plus"></i>
								</a>
	                 		</td>
	                 		<td id="td-nrcic">${pessoa.nrCicFormatted}</td>
	                 		<td>${pessoa.nmPes}</td>
	                 		<td>${pessoa.pessoaFisica.nrRg}</td>
	                 		<td>${pessoa.idTipoPessoa.description}</td>
	                 		<td>
	                 			<a href="#">
									<i class="fa fa-lg fa-pencil-square-o"></i>
								</a>
	                 		</td>
		                </tr>
	               	</c:forEach>
	              </table>
	            </div>
	          <!-- /.box-body -->
	        </div>
	        <!-- /.box -->
	      </div>
      	</div>
      </div>
      <!-- /.row (main row) -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <%@ include file="/WEB-INF/views/tags/footer.jsp"%>
  <div class="control-sidebar-bg"></div>
</div>
	<%@ include file="/WEB-INF/views/tags/importsscripts.jsp"%>
</body>
</html>