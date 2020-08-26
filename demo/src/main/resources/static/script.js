/**
 * 
 */
var app = angular.module("app",[]);

app.controller("appCtrl",function($scope,$http){
	$scope.hi = "Welcome";
	var contextPath = $('#contextPath').val();
	$http({
		method : 'POST',
		url : contextPath +"/room",
		
	}).success(function(response){
		$scope.rooms = response.rooms;
	}).error("Error Occured!");
});