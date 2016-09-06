/**
 * 
 */
angular.module("sessaoUsuarioApp").factory("combosAPI", function($http, config) {
		var _getEscolaridades = function(){
			return $http.get(config.baseUrl+"/escolaridade");
		}
		var _getEstadoCivil = function(){
			return $http.get(config.baseUrl+"/estadocivil");
		}
		var _getNaturalidades = function(){
			return $http.get(config.baseUrl+"/uf");
		}
		var _getNacionalidades = function(){
			return $http.get(config.baseUrl+"/nacionalidade");
		}
		return {
			getEscolaridades   : _getEscolaridades
			,getEstadoCivil    : _getEstadoCivil
			,getNaturalidades  : _getNaturalidades
			,getNacionalidades : _getNacionalidades
		};
		
});