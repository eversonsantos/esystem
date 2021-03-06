<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Web Store</title>
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
    <form:form role="form" action="${path}/pessoa/create" modelAttribute="pessoa" method="post" id="formPessoa">
	    <section class="content-header">
	      <h1>
			<label for="idTipoPessoa" style="margin-bottom: 0px;">Cadastro de Pessoa</label><br/>
	      </h1>
		    <div class="form-group" >
	               <c:forEach items="${tiposPessoa}" var="tipo">
		                <label class="radio inline" style="font-weight: normal;">
						      <input type="radio" name="idTipoPessoa" value="${tipo.sigla}" class="${tipo.sigla}">
						      <span> ${tipo.description} </span> 
		                </label>
	               </c:forEach>
			</div>
	    </section>

    <!-- Main content -->
	    <section class="content">
	      <!-- Main row -->
<!-- 	      <div class="row"> -->
<!-- 	      	<div class="col-md-12 col-xs-12">	 -->
					<div class="box box-primary" id="content">
						<!-- form start -->
						<div class="box-body">
							<div class="row">
								<div id="div-pessoa-fisica" class="col-md-9 col-xs-9">
									<%@ include file="/WEB-INF/views/pessoa/fisica/form.jsp"%>
								</div>
								<div id="div-pessoa-juridica">
									<h2>Em construção</h2>
								</div>
								<div class="col-md-3 col-xs-3">
									  <div class="box">
									     	<div class="box-header" align="center">
								                  <h5 id="nm-pes"></h5>
								                  <small id="ds-email"></small>
									     	</div>
										   <div class="box-body" align="center">
											     <img src="${path}/assets/adminlte/img/user-default.png" class="img-circle" alt="User Image" style="height: 125px;">
									       </div>
									       <div class="box-footer" align="center">
									       		<input type="file" class="form-control input-sm"/>
									       		<div class="row">
									       			<div class="col-md-6 col-md-6">
										       			<button type="button" class="btn btn-block btn-default btn-sm">Carregar</button>
									       			</div>
									       			<div class="col-md-6 col-md-6">
										       			<button type="button" class="btn btn-block btn-default btn-sm">Remover</button>
									       			</div>
									       		</div>	
									       </div>
									  </div>
								</div>
							</div>
							<hr/>
							<div class="row">
								<div class="col-md-8 col-xs-8">
									<%@ include file="/WEB-INF/views/pessoa/endereco/form.jsp"%>
								</div>
							</div>	
						</div>	
						<!-- /.box-body -->
				
						<div class="box-footer">
							<div class="row">
								<div class="col-md-4 col-md-6">
									<button type="submit" class="btn btn-block btn-social btn-default btn-sm">
									<i class="fa  fa-lg fa-user-plus"></i>
									Salvar Cadastro</button>
								</div>
								<div class="col-md-4 col-md-6">
									<button type="submit" class="btn btn-block btn-social btn-default btn-sm">
									<i class="fa  fa-lg fa-times"></i>
									Cancelar Cadastro</button>
								</div>
								
								<div class="col-md-4 col-md-6">
									<a href="${path}/pessoa/cadastros" class="btn btn-block btn-social btn-default btn-sm">
									<i class="fa  fa-lg fa-sign-out"></i>
									Voltar</a>
								</div>
							</div>
						</div>
				</div>
<!-- 	      	</div> -->
<!-- 	      </div> -->
	      <!-- /.row (main row) -->
	    </section>
    <!-- /.content -->
    	<input type="hidden" value="${validate}" id="validate">
	</form:form>
  </div>
  <!-- /.content-wrapper -->
  <%@ include file="/WEB-INF/views/tags/footer.jsp"%>
  <div class="control-sidebar-bg"></div>
</div>
<%@ include file="/WEB-INF/views/tags/importsscripts.jsp"%>

<script>
$(function(){
		if('${pessoa.idTipoPessoa}' != '' && '${pessoa.idTipoPessoa}' != 'undefinied'){
			if('${pessoa.idTipoPessoa}' == 'FISICA'){
				$('.F').prop("checked", true);
				$('.J').prop("checked", false);
				$('#div-pessoa-fisica').show();
				$('#div-pessoa-juridica').hide();
			}
			if('${pessoa.idTipoPessoa}' == 'JURIDICA'){
				$('.F').prop("checked", false);
				$('.J').prop("checked", true);
				$('#div-pessoa-juridica').show();
				$('#div-pessoa-fisica').hide();
			}
			$('#content').show();
		} else {
			$('#div-pessoa-fisica').hide();
			$('#div-pessoa-juridica').hide();
			$('#content').hide();
		}

		
		var expre = /[^\d]/g;
		
		$('input[type=radio][name=idTipoPessoa]').on('change', function() {
		     if($(this).val() == 'F'){
		    	 $('#div-pessoa-fisica').show();
		    	 $('#div-pessoa-juridica').hide();
		     }
		     if($(this).val() == 'J'){
		    	 $('#div-pessoa-fisica').hide();
		    	 $('#div-pessoa-juridica').show();
		     }
		     $('#content').show();
	     });
		
		$('.cic').bind("keyup blur focus", function(e) {
			e.preventDefault();
			$('#nrCic').val($(this).val().replace(expre, ''));
		});
		
		$('input[name=nmPes]').bind("keyup blur focus", function(e) {
			e.preventDefault();
			$('#nm-pes').text($(this).val());
		});
		$('input[name=dsEml]').bind("keyup blur focus", function(e) {
			e.preventDefault();
			$('#ds-email').text($(this).val());
		});
		
		$('.cic').inputmask('999.999.999-99');
		$(".nasc").inputmask('99/99/9999');
		$('.cep').inputmask('99999-999');
		$('.tel').inputmask('(99)99999-9999');
		
		
		$('.cep').bind("keyup blur focus", function(e) {
			e.preventDefault();
			$('#cd-cep').val($(this).val().replace(expre, ''));
		});
		
		$('.tel').bind("keyup blur focus", function(e) {
			e.preventDefault();
			$('#nr-tel').val($(this).val().replace(expre, ''));
		});
		
});		
</script>
</body>
</html>