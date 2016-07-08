/**
 * 
 */
angular.module("usuarioApp", ["ngLocale"]);

angular.module("usuarioApp").controller("usuarioCtrl", function($http, $scope){
	
	$scope.usuarios = [];
	$scope.usuario;
	$scope.matricula;
	$scope.dataHoje = new Date();
	$scope.isEdit = false;
	$scope.index;
	
	var loadUsuarios = function(){
		$http.get('http://localhost:8080/store-web/ws/usuario/home').success(function(data) {
			console.log(data);
			$scope.usuarios =  data;
			$scope.matricula = geraMatricula('USUA');
		}).error(function(data) {
			
		});
	}
	$scope.login = function(){
		$http.post('http://localhost:8080/store-web/ws/usuario/login', $scope.usuario).success(function(data) {
			console.log($scope.usuario);
		});
	}
	
	
	var geraMatricula = function(entity){
		var matricula = entity+'-';
		if ($scope.usuarios.length >= 0 && $scope.usuarios.length <= 9) {
				return matricula+'000'+($scope.usuarios.length+1);
		}
	}
	
	$scope.add = function(){
		if($scope.isEdit){
			$scope.usuarios.splice($scope.index, 1, $scope.usuario)
			delete $scope.usuario;
			$scope.isEdit = false;
			$scope.matricula = geraMatricula('USUA');
			$scope.dataHoje = new Date();
		}else{
			$scope.usuario.cd_mat_usu = $scope.matricula;
			$scope.usuario.dt_inc = new Date();
			$scope.usuarios.push(angular.copy($scope.usuario));
			$scope.matricula = geraMatricula('USUA');
			delete $scope.usuario;
		}
	}
	
	$scope.edit = function(i){
		$scope.isEdit = true;
		$scope.usuario = angular.copy(($scope.usuarios[i]));
		$scope.matricula = $scope.usuario.cd_mat_usu;
		$scope.dataHoje = $scope.usuario.dt_inc;
		$scope.index = i;
		
	}
	$scope.init = function(){
		delete $scope.usuario;
		$scope.isEdit = false;
		$scope.matricula = geraMatricula('USUA');
		$scope.dataHoje = new Date();
	}
	
	
	
});