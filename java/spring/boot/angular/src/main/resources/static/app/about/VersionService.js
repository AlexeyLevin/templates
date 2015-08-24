angular
	.module('services')
	.factory('VersionService',
	['$resource', function ($resource) {
		'use strict';

		return $resource('/api/version');
	}]);
