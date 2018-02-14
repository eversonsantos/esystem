'use strict';


var app = angular.module('app', ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
   // $locationProvider.html5Mode(true);
   //$locationProvider.hashPrefix('!');
    $routeProvider.when('/home', {
        templateUrl: 'home.html'
    }).when('/pessoas', {
        templateUrl: '/public/views/pessoa/form-detalhe.html',
        controller: 'pessoas-controller',
    }).when('/novo', {
        templateUrl: '/public/views/pessoa/form-principal.html',
        controller: 'pessoa-controller'
    }).otherwise({
        redirectTo: '/home'
    });
});


app.controller('mainController', function ($scope) {
    $scope.sistema = 'Sweet Dreams';
    $scope.tituloPagina = 'Caminho de Rato';2
});

