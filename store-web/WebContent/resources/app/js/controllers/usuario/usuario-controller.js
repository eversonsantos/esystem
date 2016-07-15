angular.module("appUsuario", ["ngLocale"]);

angular.module("appUsuario").controller("controlerUsuario", function($http, $scope){
	
	$scope.users = [];
	$scope.user;
	
	$scope.comboEscolaridade = [];
	$scope.comboEstadoCivil = [];
	$scope.comboNacionalidade = [];
	
	$scope.mat;
	$scope.isEdit = false;
	$scope.index;
	
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
			postCreateUser();
			delete $scope.user;
			$scope.isEdit = false;
			$scope.mat = geraMatricula('USUA');
		}else{
			$scope.user.cd_mat_usu = $scope.mat;
			postCreateUser();
			$scope.users.push(angular.copy($scope.user));
			$scope.mat = geraMatricula('USUA');
			delete $scope.user;
		}
	}
	
	$scope.goToEdit = function(i){
		$scope.isEdit = true;
		$scope.user = angular.copy(($scope.users[i]));
		$scope.mat = $scope.usuario.cd_mat_usu;
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
});