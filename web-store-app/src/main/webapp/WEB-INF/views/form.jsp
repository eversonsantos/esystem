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
<body class="hold-transition skin-blue sidebar-mini layout-boxed">

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
        Cadastro
      </h1>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Main row -->
      <div class="row">
      	<div class="col-md-12">	
      		<div class="col-xs-6">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">Cadastro Rapido</h3>
					</div>
					<!-- /.box-header -->
					<!-- form start -->
					<form role="form" action="${path}/pessoa/create" method="post">
						<div class="box-body">
							<div class="form-group">
								<label for="nmPes">Nome</label> <input type="text"
									class="form-control input-sm" id="nmPes" name= "nmPes" placeholder="Digite seu nome">
							</div>
							<div class="form-group">
								<label for="cargo">Cargo</label>
								<select id="cargo" name="cargo" class="form-control input-sm">
									<option value="">Selecione um cargo</option>
									<c:forEach items="${cargos}" var="cargo">
										<option value="${cargo}"><c:out value="${cargo.description}" /></option>
				              		</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label for="dsEml">E-mail</label> <input type="text"
									class="form-control input-sm" id="dsEml" name ="dsEml"
									placeholder="Digite seu e-mail">
							</div>
							<div class="form-group">
								<label for="dsSnh">Senha</label> <input
									type="text" class="form-control input-sm" id="dsSnh" name = "dsSnh"
									placeholder="Digite sua senha">
							</div>
						</div>
						<!-- /.box-body -->
				
						<div class="box-footer">
							<button type="submit" class="btn btn-block btn-social btn-twitter">
							<i class="fa  fa-lg fa-user-plus"></i>
							Salvar Cadastro</button>
						</div>
					</form>
				</div>
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