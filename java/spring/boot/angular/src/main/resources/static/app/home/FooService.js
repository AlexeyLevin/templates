(function (angular) {
	'use strict';

	var FooService = function ($resource) {
		return $resource('/api/foo');
	};

	FooService.$inject = ['$resource'];

	angular.module('app.services').factory('FooService', FooService);
})(angular);
