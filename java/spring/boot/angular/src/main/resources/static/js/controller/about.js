angular.module('app.controller').
	controller('about', function($scope, $http, $log, version) {
		'use strict';

		version.get(function (data) {
			$scope.version = data.version;
			$scope.name = data.name;
			$scope.description = data.description;
		});
	});
