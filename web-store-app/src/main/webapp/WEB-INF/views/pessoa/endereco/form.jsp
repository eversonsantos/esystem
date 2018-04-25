<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="modal-dialog">
  <div class="modal-content">
    <div class="modal-header">
      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span></button>
      <h4 class="modal-title">Cadastro de endereço <i class="fa fa-lg fa-map-signs"></i></h4>
    </div>
    <div class="modal-body">
      	<div class="row">
      		<div class="cold-md-3 col-xs-3">
      			<div class="form-group">
      				<label>CEP</label>
      				<input type="text" class="form-control input-sm"/>
      			</div>
      		</div>
      		<div class="cold-md-7 col-xs-6">
      			<div class="form-group">
      				<label>Logradouro(Rua)</label>
      				<input type="text" class="form-control input-sm"/>
      			</div>
      		</div>
      		<div class="cold-md-2 col-xs-3">
      			<div class="form-group">
      				<label>Nº</label>
      				<input type="text" class="form-control input-sm"/>
      			</div>
      		</div>
      		<div class="cold-md-5 col-xs-6">
      			<div class="form-group">
      				<label>Cidade</label>
      				<input type="text" class="form-control input-sm"/>
      			</div>
      		</div>
      		<div class="cold-md-6 col-xs-6">
      			<div class="form-group">
      				<label>Bairro</label>
      				<input type="text" class="form-control input-sm"/>
      			</div>
      		</div>
      		<div class="cold-md-2 col-xs-4">
      			<div class="form-group">
      				<label>UF</label>
      				<select class="form-control select2" style="width: 100%;">
					    <option value="null">Selecione..</option>
					 </select>
      			</div>
      		</div>
      		<div class="cold-md-8 col-xs-8">
      			<div class="form-group">
      				<label>Complemento</label>
      				<input type="text" class="form-control input-sm"/>
      			</div>
      		</div>
      	</div>
      
      
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-default btn-sm">Salvar endereço
      	<i class="fa fa-lg fa-plus"></i>
      </button>
      <button type="button" class="btn btn-default pull-right btn-sm" data-dismiss="modal">Fechar
      	<i class="fa  fa-lg fa-times"></i>
      </button>
    </div>
  </div>
  <!-- /.modal-content -->
</div>
