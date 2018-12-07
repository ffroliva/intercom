'use strict'
var module = angular.module('app.controller', []);
module.controller("CustomerController", ["$scope", "CustomerService",
    function($scope, CustomerService) {

        $scope.customers = [];

        CustomerService.getAllCustomers().then(function(value) {
            console.log(value.data);
            $scope.customers = value.data;
        }, function(reason) {
            console.log("error occured");
        }, function(value) {
            console.log("no callback");
        });

]);