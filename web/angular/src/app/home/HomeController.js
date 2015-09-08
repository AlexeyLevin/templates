(function (angular) {
	'use strict';

	var HomeController = function ($scope, fooService) {
		$scope.foo = fooService();
	};

	HomeController.$inject = ['$scope', 'FooService'];

	angular.module('app.controllers').controller('HomeController', HomeController);
})(angular);
