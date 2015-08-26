(function (angular) {
	'use strict';

	var AboutController = function ($scope, versionService) {
		versionService.get(function (data) {
			$scope.app = data;
		});
	};

	AboutController.$inject = ['$scope', 'VersionService'];

	angular.module('app.controllers').controller('AboutController', AboutController);
})(angular);
