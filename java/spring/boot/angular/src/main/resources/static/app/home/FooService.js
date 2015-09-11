(function (angular) {
	'use strict';

	var FooService = function ($resource, configService) {
		return $resource(configService.apiUrl + 'foo');
	};

	FooService.$inject = ['$resource', 'ConfigService'];

	angular.module('app.services').service('FooService', FooService);
})(angular);
