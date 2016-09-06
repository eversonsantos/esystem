angular.module('appMain',[]);
	angular.module('appMain').controller('ctrl',function($http, $scope){
			$scope.msg = 'Ola'
			$scope.produtos = [];
			$scope.produto;
			var carregar = function(){$http.get('http://10.0.20.89:8080/services-ws/ws/ws-resources/sayHello').success(function(data){
				console.log(data);
				$scope.produtos = data;
				console.log('Produtos '+$scope.produtos);
			});
			}
			$scope.addCliente = function () {
				$http.post('http://10.0.20.89:8080/services-ws/ws/ws-resources/createProduto',$scope.produtos).success(function(data){
					console.log('Data '+data);
					delete $scope.produto;
				});
			}
			carregar();
	});