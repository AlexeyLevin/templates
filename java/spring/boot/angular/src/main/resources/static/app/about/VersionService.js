(function (angular) {
	'use strict';

	var VersionFactory = function($resource, configService) {
		return $resource(configService.apiUrl + 'version');
	};

	VersionFactory.$inject = ['$resource', 'ConfigService'];

	angular.module('app.services').factory('VersionService', VersionFactory);
})(angular);
