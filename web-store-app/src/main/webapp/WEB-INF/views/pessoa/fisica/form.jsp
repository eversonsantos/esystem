<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
	<div class="row">
		<div class=" col-md-2 col-xs-6">
			<div class="form-group">
				<label for="nrCic">CPF</label><br/>
				<input class="form-control input-sm cic" placeholder="000.000.000-00"/>
				<form:input type="hidden" class="form-control input-sm" path="nrCic" id="nrCic"/>
				<span class="help-block has-error">
					<form:errors path="nrCic" cssClass="error"/>
				</span>
			</div>	
		</div>
		<div class=" col-md-6 col-xs-6">
			<div class="form-group">
				<label for="nmPes">Nome</label><br/>
				<input class="form-control input-sm" name="nmPes"/>
			</div>	
		</div>
	</div>
	<div class="row">
		<div class=" col-md-2 col-xs-6">
			<div class="form-group">
			  <label>Nº RG</label>
			  <input class="form-control input-sm" name="pessoaFisica.nrRg"/>
			</div>
		</div>
		<div class=" col-md-2 col-xs-6">
			<div class="form-group">
			  <label>Data Nascimento</label>
			  <input class="form-control input-sm nasc" name="pessoaFisica.dtNasc"/>
			</div>
		</div>
		<div class=" col-md-3 col-xs-6">
			<div class="form-group">
				<label for="genero" style="margin-bottom: 0px;">Sexo</label><br/>
		        <c:forEach items="${generos}" var="genero">
		          <label class="radio inline" style="font-weight: normal;">
			    	<input type="radio" name="pessoaFisica.chSxo" value="${genero.sigla}">
			    	<span> ${genero.description} </span> 
		          </label>
		        </c:forEach>
			</div>
		</div>
	</div>
	<div class="row">				
		<div class=" col-md-4 col-xs-6">
			<div class="form-group">
			  <label>Estado Civil</label>
			  <select class="form-control input-sm select2" style="width: 100%;" name="pessoaFisica.dsEstCivil">
			    <option value="null">Selecione..</option>
				<c:forEach items="${estCivis}" var="est">
					<option value="${est.sigla}">${est.description}</option>	
				</c:forEach>
			  </select>
			</div>
		</div>
		<div class=" col-md-4 col-xs-6">
			<div class="form-group">
			  <label>Escolaridade</label>
			  <select class="form-control input-sm select2" style="width: 100%;" name="pessoaFisica.dsEsc">
			    <option value="null">Selecione..</option>
				<c:forEach items="${escolaridades}" var="esc">
					<option value="${esc.description}">${esc.description}</option>	
				</c:forEach>
			  </select>
			</div>
		</div>
	</div>		
		
	<div class="row">	
		<div class=" col-md-4 col-xs-6">
			<div class="form-group">
				<label for="nmPai">Nome Pai</label><br/>
				<input class="form-control input-sm" name="pessoaFisica.nmPai"/>
			</div>	
		</div>
		<div class=" col-md-4 col-xs-6">
			<div class="form-group">
				<label for="nmMae">Nome Mãe</label><br/>
				<input class="form-control input-sm" name="pessoaFisica.nmMae"/>
			</div>	
		</div>
	</div>
	<div class="row">	
		<div class=" col-md-6 col-xs-6">
			<div class="form-group">
				<label for="nmPai">E-mail</label><br/>
				<input class="form-control input-sm" name="dsEml"/>
			</div>	
		</div>
	</div>
</div>
