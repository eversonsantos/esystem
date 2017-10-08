angular.module("sessaoUsuarioApp").controller("usuarioPrincipal", function($http, $scope, combosAPI){
	
	$scope.telefone;
	$scope.usuarioDTO = new Object();
	$scope.usuarioDTO.telefones = [];
	
	$scope.comboEscolaridade = [];
	$scope.comboEstadoCivil = [];
	$scope.comboNacionalidade = [];
	$scope.comboNaturalidade = [];
	
	$scope.isEdit = false;
	$scope.index;
	$scope.isEditEndereco = true;
	
	
//	$scope.removeSelecionados = function(telefones, i){
//		$scope.usuarioDTO.telefones =  telefones.filter(function(telefone){
//			if(telefone != telefones[i])
//			{ 
//				return telefone
//			}
//		});
//		displayMensagem(2, 'Exclusão de Telefone', 'Telefone excluído com sucesso!.')
//	}
//	
//	var validaDddOrTelefone = function(){
//		
//		if($scope.telefone.nr_ddd_tel == '' || $scope.telefone.nr_ddd_tel.length < 2){
//			displayMensagem(2, 'Inclusão de Telefone', 'DDD do telefone invalído!.')
//			findElementById("ddd_txt").focus();
//			$scope.telefone.nr_ddd_tel = '';
//			return false;
//		}
//		if($scope.telefone.nr_tel != ''){ 
//			if($scope.telefone.nr_tel.length <= 8){
//				if($scope.telefone.nr_tel.substring(0, 1) == '9' || $scope.telefone.nr_tel.substring(0, 1) == '8'){
//					displayMensagem(2, 'Inclusão de Telefone', 'Número do telefone invalído!.')
//					findElementById("tel_txt").focus();
//					$scope.telefone.nr_tel = '';
//					return false;
//				}
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	$scope.searchEndereco = function(){
//		var cep_txt = findElementById("cep_txt");
//		var nr_txt = findElementById("nr_txt");
//		var cb_uf_en = findElementById("cb_uf_en");
//		
//		if (!validaSequenciaNumerica($scope.usuarioDTO.endereco.cd_cep)){
//			displayMensagem(2, 'Pesquisa de Endereço', 'CEP informalido inválido!.');
//			cep_txt.value = '';
//			cep_txt.focus();
//			return;
//		}
//		
//		$http.get("https://viacep.com.br/ws/"+$scope.usuarioDTO.endereco.cd_cep+"/json/").success(function(data) {
//			$scope.usuarioDTO.endereco.cd_cep = data.cep;
//			$scope.usuarioDTO.endereco.nm_cid = data.localidade;
//			$scope.usuarioDTO.endereco.nm_log = data.logradouro;
//			$scope.usuarioDTO.endereco.nm_bai = data.bairro;
//			$scope.usuarioDTO.endereco.cd_uf = data.uf;
//			$scope.usuarioDTO.endereco.ds_com = data.complemento;
//			$scope.isEditEndereco = false;
//			nr_txt.focus();
//			cb_uf_en.disabled = false;
//		}).error(function(status) {
//			displayMensagem(3, 'Pesquisa de Endereço', 'Erro ao pesquisar endereço. Status :'+ status)
//		});
//	}
//	
//		
//	var carregaEscolaridades = function(){
//		combosAPI.getEscolaridades().success(function(data) {
//			$scope.comboEscolaridade = data;
//		});
//	}
//	var carregaEstadoCivil = function(){
//		combosAPI.getEstadoCivil().success(function(data) {
//			$scope.comboEstadoCivil = data;
//		});
//	}
//	var carregaNacionalidades = function(){
//		combosAPI.getNacionalidades().success(function(data) {
//			$scope.comboNacionalidade = data;
//		});
//	}
//	
//	var carregaNaturalidades = function(){
//		combosAPI.getNaturalidades().success(function(data) {
//			$scope.comboNaturalidade = data;
//		});
//	}
//	
//	$scope.postCreateUser = function(){
//		
//		$http.post('http://localhost:8080/store-web/ws/usuario/createUser', $scope.usuarioDTO).success(function(data) {
//			
//		});
//		$scope.usuarioDTO = new Object();
//	}
//	
//	$scope.createUser = function(){
//		if($scope.isEdit){
//			$scope.users.splice($scope.index, 1, $scope.user)
//			delete $scope.user;
//			$scope.isEdit = false;
//		}else{
//			$scope.users.push(angular.copy($scope.user));
//			delete $scope.user;
//		}
//	}
//	
//	$scope.createTelefone = function(){
//		var isExistemTelefone = true;
//		alert(validaDddOrTelefone())
//		if(validaDddOrTelefone()){
//			for (var i = 0; i < $scope.usuarioDTO.telefones.length; i++) {
//				if(angular.equals($scope.telefone, $scope.usuarioDTO.telefones[i]))
//				{ 
//					isExistemTelefone = false;
//				}
//			}
//			if(isExistemTelefone){
//				$scope.usuarioDTO.telefones.push(angular.copy($scope.telefone));
//				delete $scope.telefone;
//				displayMensagem(1, 'Inclusão de Telefone', 'Telefone adicionado com sucesso!.');
//			}else{
//				delete $scope.telefone;
//				displayMensagem(2, 'Inclusão de Telefone', 'Telefone já foi adicionado na lista!.');
//			}
//		}	
//	}
	
	
	$scope.init = function(){
		$scope.isEdit = false;
		$scope.dateToday = new Date();
		
		$http.get("http://localhost:8080/casadocodigo/livro/lista").success(function(data){
			var i = data;
			console.log(i);
		});
	}
	$scope.init();
});