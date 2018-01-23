'use strict';

var AngularSpringmvcMybatis = {};

var App = angular.module('MavenModuleApp', []);

App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/users', {
        templateUrl: 'users/layout',
        controller: UserController
    });
    $routeProvider.otherwise({redirectTo: '/users'});
}]);
