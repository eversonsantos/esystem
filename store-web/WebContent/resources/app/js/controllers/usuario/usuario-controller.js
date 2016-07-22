angular.module("appUsuario", ["ngLocale","blockUI"]).
	config(function(blockUIConfig){
		blockUIConfig.message = 'Carregando..';
//		blockUIConfig.templateUrl = '../../view/template/load.html'; Template Personalizado
	});

angular.module("appUsuario").controller("controlerUsuario", function($http, $scope, $timeout){
	
	$scope.users = [];
	$scope.user;
	
	$scope.telefone;
	$scope.telefones = [
	                    	{nr_ddd_tel : '91', nr_tel : '988530893'},
	                    	{nr_ddd_tel : '91', nr_tel : '37761602'},
	                    	{nr_ddd_tel : '91', nr_tel : '99998888'}
	                   ];
	
	$scope.comboEscolaridade = [];
	$scope.comboEstadoCivil = [];
	$scope.comboNacionalidade = [];
	$scope.comboNaturalidade = [];
	
	$scope.mat;
	$scope.isEdit = false;
	$scope.index;
	$scope.isEditEndereco = true;
	
	$scope.cep = '';
	$scope.localidade = '';
	$scope.logradouro = '';
	$scope.uf = '';
	$scope.bairro = '';
	$scope.complemento = '';
	
	
	$scope.removeSelecionados = function(telefones, i){
		$scope.telefones =  telefones.filter(function(telefone){
			if(telefone != telefones[i])
			{ 
				return telefone
			}
		});
		Lobibox.notify('info', {
			delay: 3000,
			delayIndicator: false,
			title: 'Exlusão de Telefone',
			showClass: 'jumpUp',
			hideClass: 'zoomOut',
			position: 'bottom right', //or 'center bottom'
			msg: 'Telefone excluído com sucesso!.'
		});
	}
	
	
	$scope.searchEndereco = function(){
		var validacep = /^[0-9]{8}$/;
		
		if (!validacep.test($scope.cep)){
			alert('CEP Informado invalído');
			return;
		}
		
		$http.get("https://viacep.com.br/ws/"+$scope.cep+"/json/").success(function(data) {
			$scope.cep = data.cep;
			$scope.localidade = data.localidade;
			$scope.logradouro = data.logradouro;
			$scope.bairro = data.bairro;
			$scope.uf = data.uf;
			$scope.complemento = data.complemento;
			$scope.isEditEndereco = false;
		}).error(function() {
			
		});
	}
	
	var loadUsuarios = function(){
		$http.get('http://localhost:8080/store-web/ws/usuario/home').success(function(data) {
			$scope.users =  data;
			$scope.mat = geraMatricula('USUA');
		});
	}
	
	var loadEscolaridades = function(){
		$http.get('http://localhost:8080/store-web/ws/combo/escolaridade').success(function(data) {
			$scope.comboEscolaridade = data;
		}).error(function(data) {
			alert('Erro ao carregar recurso de Escolaridade');
		});
	}
	var loadEstadoCivil = function(){
		$http.get('http://localhost:8080/store-web/ws/combo/estadocivil').success(function(data) {
			$scope.comboEstadoCivil = data;
		});
	}
	var loadNacionalidade = function(){
		$http.get('http://localhost:8080/store-web/ws/combo/nacionalidade').success(function(data) {
			$scope.comboNacionalidade = data;
		});
	}
	
	var loadNaturalidade = function(){
		$http.get('http://localhost:8080/store-web/ws/combo/uf').success(function(data) {
			$scope.comboNaturalidade = data;
		});
	}
	
	$scope.postCreateUser = function(){
		parseEndereco();
		console.log($scope.user);
		$http.post('http://localhost:8080/store-web/ws/usuario/createUser', $scope.user).success(function(data) {
			console.log($scope.user);
		});
	}
	
	
	var geraMatricula = function(entity){
		var matricula = entity+'-';
		if ($scope.users.length >= 0 && $scope.users.length <= 9) {
				return matricula+'000'+($scope.users.length+1);
		}
	}
	
	$scope.createUser = function(){
		parseEndereco();
		if($scope.isEdit){
			$scope.users.splice($scope.index, 1, $scope.user)
			delete $scope.user;
			$scope.isEdit = false;
			$scope.mat = geraMatricula('USUA');
		}else{
			$scope.user.cd_mat_usu = $scope.mat;
			$scope.users.push(angular.copy($scope.user));
			$scope.mat = geraMatricula('USUA');
			delete $scope.user;
		}
	}
	
	$scope.createTelefone = function(){
		$scope.telefones.push(angular.copy($scope.telefone));
		delete $scope.telefone;
		Lobibox.notify('success', {
			delay: 3000,
			delayIndicator: false,
			title: 'Inclusão de Telefone',
			showClass: 'jumpUp',
			hideClass: 'zoomOut',
			position: 'bottom right', //or 'center bottom'
			msg: 'Telefone adicionado com sucesso!.'
			});
	}
	
	
	$scope.goToEdit = function(i){
		$scope.isEdit = true;
		$scope.user = angular.copy(($scope.users[i]));
		$scope.mat = $scope.user.cd_mat_usu;
		$scope.dateToday = $scope.user.dt_inc;
		$scope.index = i;
		
	}
	
	$scope.excluiTelefone = function(){
		$scope.telefones = $scope.telefones.filter(function(elt, i) {
			return true;
		})
	}
	
	var parseEndereco = function(){
		$scope.user.cd_pes.cd_end.cd_cep = $scope.cep;
		$scope.user.cd_pes.cd_end.nm_cid = $scope.localidade;
		$scope.user.cd_pes.cd_end.nm_bai = $scope.bairro;
		$scope.user.cd_pes.cd_end.nm_log = $scope.logradouro;
//		$scope.user.cd_pes.cd_end.cd_uf = 
		$scope.comboNaturalidade.filter(function(uf) {
			if(uf.sg_uf == $scope.uf){
				$scope.user.cd_pes.cd_end.cd_uf = uf;
				return true;
			}
		});
//		Lobibox.notify('success', {
//			delay: 3000,
//			delayIndicator: false,
//			size : 'large',
//			title: 'Endereço',
//			showClass: 'jumpUp',
//			hideClass: 'zoomOut',
//			position: 'bottom right', //or 'center bottom'
//			msg: 'Cep: '+ $scope.user.cd_pes.cd_end.cd_cep+' <br/>'+
//					'Cidade: '+ $scope.user.cd_pes.cd_end.nm_cid+' <br/>'+
//						'Bairro: '+ $scope.user.cd_pes.cd_end.nm_bai+' <br/>'+
//							'Logradouro: '+ $scope.user.cd_pes.cd_end.nm_log+' <br/>'+
//									'Estado: '+ $scope.user.cd_pes.cd_end.cd_uf.sg_uf+' <br/>'
//					
//			});
	}
	
	$scope.init = function(){
		delete $scope.user;
		$scope.isEdit = false;
		$scope.mat = geraMatricula('USUA');
		$scope.dateToday = new Date();
	}
	
	loadUsuarios();
	loadEscolaridades();
	loadEstadoCivil();
	loadNacionalidade();
	loadNaturalidade();
});