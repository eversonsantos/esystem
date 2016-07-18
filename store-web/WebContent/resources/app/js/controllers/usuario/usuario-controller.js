angular.module("appUsuario", ["ngLocale"]);

angular.module("appUsuario").controller("controlerUsuario", function($http, $scope){
	
	$scope.users = [];
	$scope.user;
	$scope.telefone;
	$scope.telefones = [];
	
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
	
	$scope.searchEndereco = function(){
		var validacep = /^[0-9]{8}$/;
		
		if (!validacep.test($scope.cep)){
			alert('CEP Informado invalído');
			return;
		}
		
		$http.get("https://viacep.com.br/ws/"+$scope.cep+"/json/").success(function(data) {
			console.log(data);
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
			console.log(data);
		});
	}
	var loadEstadoCivil = function(){
		$http.get('http://localhost:8080/store-web/ws/combo/estadocivil').success(function(data) {
			$scope.comboEstadoCivil = data;
			console.log(data);
		});
	}
	var loadNacionalidade = function(){
		$http.get('http://localhost:8080/store-web/ws/combo/nacionalidade').success(function(data) {
			$scope.comboNacionalidade = data;
			console.log(data);
		});
	}
	
	var loadNaturalidade = function(){
		$http.get('http://localhost:8080/store-web/ws/combo/uf').success(function(data) {
			$scope.comboNaturalidade = data;
			console.log(data);
		});
	}
	
	var postCreateUser = function(){
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
	}
	
	
	$scope.goToEdit = function(i){
		$scope.isEdit = true;
		$scope.user = angular.copy(($scope.users[i]));
		$scope.mat = $scope.user.cd_mat_usu;
		$scope.dateToday = $scope.user.dt_inc;
		$scope.index = i;
		
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