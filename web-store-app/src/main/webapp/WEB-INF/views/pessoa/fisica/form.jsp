<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<div class="row">
		<div class="col-md-3 col-xs-6">
			<div class="form-group">
				<label for="nrCic">CPF</label><br/>
				<input class="form-control input-sm cic" placeholder="000.000.000-00"/>
				<input type="hidden" class="form-control input-sm" name="nrCic" id="nrCic"/>
			</div>	
		</div>
		<div class="col-md-5 col-xs-6">
			<div class="form-group">
				<label for="nmPes">Nome</label><br/>
				<input class="form-control input-sm" name="nmPes"/>
			</div>	
		</div>
		<div class="col-md-2 col-xs-6">
			<div class="form-group">
			  <label>Nº RG</label>
			  <input class="form-control input-sm" name="cdPfis.nrRg"/>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-3 col-xs-6">
			<div class="form-group">
				<label for="genero" style="margin-bottom: 0px;">Sexo</label><br/>
		        <c:forEach items="${generos}" var="genero">
		          <label class="radio inline" style="font-weight: normal;">
			    	<input type="radio" name="cdPfis.chSxo" value="${genero.sigla}">
			    	<span> ${genero.description} </span> 
		          </label>
		        </c:forEach>
			</div>
		</div>
		<div class="col-md-2 col-xs-6">
			<div class="form-group">
			  <label>Data Nascimento</label>
			  <input class="form-control input-sm" name="cdPfis.dtNasc"/>
			</div>
		</div>			
		<div class="col-md-3 col-xs-6">
			<div class="form-group">
			  <label>Estado Civil</label>
			  <select class="form-control select2" style="width: 100%;" name="cdPfis.dsEstCivil">
			    <option value="null">Selecione..</option>
				<c:forEach items="${estCivis}" var="est">
					<option value="${est.sigla}">${est.description}</option>	
				</c:forEach>
			  </select>
			</div>
		</div>
		<div class="col-md-4 col-xs-6">
			<div class="form-group">
			  <label>Escolaridade</label>
			  <select class="form-control select2" style="width: 100%;" name="cdPfis.dsEsc">
			    <option value="null">Selecione..</option>
				<c:forEach items="${escolaridades}" var="esc">
					<option value="${esc.description}">${esc.description}</option>	
				</c:forEach>
			  </select>
			</div>
		</div>
	</div>		
		
	<div class="row">	
		<div class="col-md-6 col-xs-6">
			<div class="form-group">
				<label for="nmPai">Nome Pai</label><br/>
				<input class="form-control input-sm" name="cdPfis.nmPai"/>
			</div>	
		</div>
		<div class="col-md-6 col-xs-6">
			<div class="form-group">
				<label for="nmMae">Nome Mãe</label><br/>
				<input class="form-control input-sm" name="cdPfis.nmMae"/>
			</div>	
		</div>
	</div>
	<div class="row">	
		<div class="col-md-6 col-xs-6">
			<div class="form-group">
				<label for="nmPai">E-mail</label><br/>
				<input class="form-control input-sm" name="dsEml"/>
			</div>	
		</div>
	</div>
	<hr/>
	<div class="row">
		<div class="col-md-4 col-md-6">
			<button type="button" class="btn btn-block btn-social btn-default btn-sm" data-toggle="modal" data-target="#modal-endereco" data-backdrop="static" data-keyboard="false">
			<i class="fa  fa-lg fa-map-signs"></i>
			Adicionar Endereço</button>
		</div>
		<div class="col-md-4 col-md-6">
			<button type="submit" class="btn btn-block btn-social btn-default btn-sm" data-toggle="modal" data-target="#modal-telefone" data-backdrop="static" data-keyboard="false">
			<i class="fa  fa-lg  fa-phone"></i>
			Adicionar Contatos</button>
		</div>
	</div>	
</div>
	<div id="modal-endereco" class="modal fade" >
		<%@ include file="/WEB-INF/views/pessoa/endereco/form.jsp"%>
	</div>								
