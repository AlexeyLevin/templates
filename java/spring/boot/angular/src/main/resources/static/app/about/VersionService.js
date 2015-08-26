(function (angular) {
	'use strict';

	var VersionFactory = function($resource) {
		return $resource('/api/version');
	};

	VersionFactory.$inject = ['$resource'];

	angular.module('app.services').factory('VersionService', VersionFactory);
})(angular);
