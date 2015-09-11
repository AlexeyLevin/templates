(function (angular) {
	'use strict';

	var ConfigService = function ($injector) {
		try {
			this.production = $injector.get('production');
		} catch (e) {
			this.production = false;
		}

		try {
			this.apiUrl = $injector.get('apiUrl');
		} catch (e) {
			this.apiUrl = 'http://localhost:8080/api/'
		}
	};

	ConfigService.$inject = ['$injector'];

	angular.module('app.services').service('ConfigService', ConfigService);
})(angular);
