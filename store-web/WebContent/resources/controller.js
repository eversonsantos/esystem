/**
 * 
 */
var app = angular.module("myApp", []);
app.controller("appCtrl",function($scope){
	
	$scope.names = [
	                {name:"Everson Lisboa", age: 26},
	                {name:"Mikael Gustavo", age:0.1},
	                {name:"Jordana Muniz", age: 22}
	                ];
	
	$scope.changeName = function(){
		var n = $scope.name;
		console.log(n);
		$scope.name = n +" "+ " Lisboa";
	}
	$scope.add= function(){
		
		$scope.names.push($scope.name, $scope.age);
		
		console.log($scope.names.length);
	}
	
});
	
