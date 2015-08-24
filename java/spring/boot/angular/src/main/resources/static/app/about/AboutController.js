angular
	.module('controllers')
	.controller('AboutController',
	['$scope', 'VersionService', function ($scope, versionService) {
		'use strict';

		versionService.get(function (data) {
			$scope.app = data;
		});
	}]);
