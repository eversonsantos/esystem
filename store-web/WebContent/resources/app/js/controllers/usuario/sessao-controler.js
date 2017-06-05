/**
 * 
 */
angular.module('sessaoUsuarioApp', ["ngLocale","blockUI","ngRoute"])
	.config(function(blockUIConfig){
		blockUIConfig.message = 'Carregando..';
//		blockUIConfig.templateUrl = '../../view/template/load.html'; Template Personalizado
	})
	.config(['$routeProvider', function($routeProvider){
    $routeProvider
    .when('/',
    			{
    				templateUrl:'index.html'
    			})
    .when('/usuarios',	
            	{
    				templateUrl:'view/usuario/usuario-detalhe.html'
    				,controller: 'usuarioPrincipal'
        		})
    .when('/novousuario',	
            	{
    				templateUrl:'view/usuario/usuario-form.html'
    				,controller: 'usuarioPrincipal'
        		})
    .when('/printers',{template:'This is the printers Route'})
    .otherwise({redirectTo:'/'});
	}])
.controller('controlerSessao', function($scope){
	
});