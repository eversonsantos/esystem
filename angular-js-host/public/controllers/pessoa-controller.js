var app = angular.module('app');

app.controller('pessoa-controller', function ($scope, $http) {
    $scope.titulo = 'Novo Membro'

    $scope.endereco;
    $scope.pessoa;
    $scope.retorno = '';
    $scope.displayMsg = false;
    $scope.searchText = '';


    $scope.submit = function () {
        $scope.pessoa.endereco = $scope.endereco;
        $http.post('http://localhost:8080/pessoas', $scope.pessoa).then(
            function successCallback(response, status) {
                $scope.retorno = response.data;
                $scope.displayMsg = true;
                console.log($scope.retorno)
                $scope.init();
            },
            function errorCallback(response, status) {
                $scope.retorno = response.data
                console.log(response);
            }
        );

    };
    $scope.init = function () {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/pessoas/init'
        }).then(function successCallback(response) {
            $scope.pessoa = response.data;
            $scope.endereco = $scope.pessoa.endereco;
        }, function erroCallback(response) {
            // console.log(response.data)
        });
    };

    $scope.init();
});
