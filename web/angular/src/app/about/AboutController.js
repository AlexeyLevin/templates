(function (angular) {
	'use strict';

	var AboutController = function ($scope, configService) {
		$scope.production = configService.production;

		$scope.app = {name: 'foo', version: '0.1', description: 'bar'};
	};

	AboutController.$inject = ['$scope', 'ConfigService'];

	angular.module('app.controllers').controller('AboutController', AboutController);
})(angular);
