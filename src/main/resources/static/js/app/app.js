
'use strict'
var app = angular.module('app', ['ui.bootstrap', 'app.controller',
    'app.service'
]);
app.constant("CONSTANTS", {
    getCustomersWithinDistance: "/customers/within-distance/",
    getAllCustomers: "/customers",
});