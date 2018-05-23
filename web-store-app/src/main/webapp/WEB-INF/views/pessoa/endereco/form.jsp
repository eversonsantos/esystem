<div class="box">
	<div class="box-body">
		<div class="row">
			<div class="cold-md-3 col-xs-3">
				<div class="form-group">
					<label>CEP</label> <input type="text"
						class="form-control input-sm cep" /> <input type="hidden"
						class="form-control input-sm" name="endereco.cdCep" id="cd-cep" />
				</div>
			</div>
			<div class="cold-md-7 col-xs-6">
				<div class="form-group">
					<label>Logradouro(Rua)</label> <input type="text"
						class="form-control input-sm" name="endereco.nmLog" />
				</div>
			</div>
			<div class="cold-md-2 col-xs-3">
				<div class="form-group">
					<label>Nº</label> <input type="text" class="form-control input-sm"
						name="endereco.nrEnd" />
				</div>
			</div>
			<div class="cold-md-5 col-xs-6">
				<div class="form-group">
					<label>Cidade</label> <input type="text"
						class="form-control input-sm" name="endereco.nmCid" />
				</div>
			</div>
			<div class="cold-md-6 col-xs-6">
				<div class="form-group">
					<label>Bairro</label> <input type="text"
						class="form-control input-sm" name="endereco.nmBai" />
				</div>
			</div>
			<div class="cold-md-2 col-xs-4">
				<div class="form-group">
					<label>UF</label> 
					<select class="form-control input-sm select2" style="width: 100%;" name="endereco.sgUf">
						<option value="null">Selecione..</option>
						<c:forEach items="${estados}" var="uf">
								<option value="${uf.value}">${uf.value} - ${uf.description}</option>
	               		</c:forEach>
					</select>
				</div>
			</div>
			<div class="cold-md-8 col-xs-8">
				<div class="form-group">
					<label>Complemento</label> <input type="text"
						class="form-control input-sm" name="endereco.dsCpl" />
				</div>
			</div>
			<div class="cold-md-3 col-xs-4">
				<div class="form-group">
					<label>Telefone</label>
					<input type="text" class="form-control input-sm tel"/>
					<input type="hidden" class="form-control input-sm" name="endereco.nrTel" id="nr-tel" />
				</div>
			</div>
			<div class="cold-md-3 col-xs-4">
				<div class="form-group">
					<label>Tipo Telefone</label>
					<select class="form-control input-sm select2" name="endereco.dsTipoTel">
						<option value="null">Selecione...</option>
						<option value="Residencial">Residencial</option>
						<option value="Celular">Celular</option>
					</select>
				</div>
			</div>
		</div>
	</div>
</div>