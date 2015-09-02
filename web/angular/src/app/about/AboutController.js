(function (angular) {
	'use strict';

	var AboutController = function ($scope) {
		$scope.app = {name: 'foo', version: '0.1', description: 'bar'};
	};

	AboutController.$inject = ['$scope'];

	angular.module('app.controllers').controller('AboutController', AboutController);
})(angular);
