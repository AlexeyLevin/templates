angular.module('app.controller').
	controller('main', function($scope, $http, $log, foo) {
		'use strict';

		foo.query(function (data) {
			$scope.foo = data;
		});
	});
