(function (angular) {
	'use strict';

	var AboutController = function ($scope, versionService, configService) {
		$scope.production = configService.production;

		versionService.get(function (data) {
			$scope.app = data;
		});
	};

	AboutController.$inject = ['$scope', 'VersionService', 'ConfigService'];

	angular.module('app.controllers').controller('AboutController', AboutController);
})(angular);
