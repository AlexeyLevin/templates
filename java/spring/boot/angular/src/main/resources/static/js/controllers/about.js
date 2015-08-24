angular
	.module('controllers')
	.controller('AboutController',
	['$scope', 'VersionService', function ($scope, versionService) {
		'use strict';

		versionService.get(function (data) {
			$scope.version = data.version;
			$scope.name = data.name;
			$scope.description = data.description;
		});
	}]);
