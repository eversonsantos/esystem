<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<c:set var="path" value="${pageContext.request.contextPath}"/>
	<%@ include file="/WEB-INF/views/tags/importscss.jsp"%>
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="${path}/"><b>Sweet</b>Dreams</a>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg"><b>Faça o login para iniciar sua sessão</b></p>

    <form>
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="Email">
        <span class="fa  fa-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="Password">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        <!-- /.col -->
	        <div class="col-xs-12">
<!-- 	          <button type="submit" >Entrar</button> -->
	          <a href="${path}/user/login" class="btn btn-block btn-social btn-dropbox">Entrar
	          	<i class="fa fa-sign-in"></i>
	          </a>
	        </div>
        <!-- /.col -->
      </div>
    </form>

<!--     <div class="social-auth-links text-center"> -->
<!--       <p>- OR -</p> -->
<!--       <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign in using -->
<!--         Facebook</a> -->
<!--       <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign in using -->
<!--         Google+</a> -->
<!--     </div> -->
    <!-- /.social-auth-links -->

    <a href="#">Eu perdir minha senha</a><br>

    <a href="register.html" class="text-center">
    	Quero fazer parte guilda!
    	<span class="fa fa-lg fa-hand-peace-o"></span>
    </a>

  </div>
  <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<%@ include file="/WEB-INF/views/tags/importsscripts.jsp"%>

</body>
</html>