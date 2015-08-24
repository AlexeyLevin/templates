angular
	.module('controllers')
	.controller('HomeController',
	['$scope', 'FooService', function ($scope, fooService) {
		'use strict';

		fooService.query(function (data) {
			$scope.foo = data;
		});
	}]);
