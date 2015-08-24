angular
	.module('services')
	.factory('FooService',
	['$resource', function ($resource) {
		'use strict';

		return $resource('/api/foo');
	}]);
