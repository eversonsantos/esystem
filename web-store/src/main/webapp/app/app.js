/**
 * 
 */
angular.module('webStoreApp',['ngRoute'])
.config(['$routeProvider','$locationProvider', function($routeProvider, $locationProvider){
//	$locationProvider.hashPrefix('!');
	$locationProvider.html5Mode({
		enabled : true,
		requireBase : false//contexto da aplicação tem que passado manual
	});
    $routeProvider
    .when('/pessoa',	
        {
			templateUrl:'web-store/pages/cadastro/form-detalhe.html',
			controller : 'cadastro-detalhe-controller',
			controllerAs: 'cadastro-detalhe'
		})
	.when('/pessoas',	
        {
			templateUrl:'web-store/pages/cadastro/form-principal.html',
		})
	.otherwise({redirectTo:'/web-store/'});
}]).controller('appController', ['$scope',function ($scope){
	
}]);