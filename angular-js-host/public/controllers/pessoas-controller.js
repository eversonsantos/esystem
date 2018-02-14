var app = angular.module('app');

app.controller('pessoas-controller', function ($scope, $http) {
    $scope.titulo = 'Novo Membro'

    $scope.pessoas = [];

    $scope.loadList = function () {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/pessoas/'
        }).then(function successCallback(response) {
            $scope.pessoas = response.data;
        }, function erroCallback(response) {
            $scope.msg = response.data;
        });
    }
    $scope.loadList();
});
