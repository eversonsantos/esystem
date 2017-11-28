'use strict';


var app = angular.module('app', ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
    // $locationProvider.html5Mode(true);
    // $locationProvider.hashPrefix('!');
    $routeProvider.when('/home', {
        templateUrl: 'home.html'
    }).when('/membro', {
        templateUrl: '/public/membro/form-detalhe.html'
    }).when('/novo', {
        templateUrl: '/public/membro/form-principal.html'
    }).otherwise({
        redirectTo: '/'
    });
})

app.controller('mainController', function ($scope) {
    $scope.sistema = 'Sweet Dreams';
    $scope.tituloPagina = 'Titulo Pagina';
});

