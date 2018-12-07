'use strict'
app.controller("CustomerController", function CustomerController($scope, CustomerService) {

        var vm = this;
        // attributes
        vm.customers = [];
        // methods
        vm.getAllCustomers = _getAllCustomers;
        $scope.getCustomersWithinDistance = _getCustomersWithinDistance;

        var _getAllCustomers = function() {
            CustomerService.getAllCustomers().then(function(value) {
                console.log(value.data);
                $scope.customers = value.data;
            }, function(reason) {
                console.log("error occured");
            }, function(value) {
                console.log("no callback");
            });
        }

        var _getCustomersWithinDistance = function() {
            CustomerService.getCustomersWithinDistance(100).then(function(value) {
                console.log(value.data);
                $scope.customers = value.data;
            }, function(reason) {
                console.log("error occured");
            }, function(value) {
                console.log("no callback");
            });
        }

        CustomerService.getCustomersWithinDistance().then(function(value) {
            console.log(value.data);
            $scope.customers = value.data;
        }, function(reason) {
            console.log("error occured");
        }, function(value) {
            console.log("no callback");
        });
});
