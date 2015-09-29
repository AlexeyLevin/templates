(function (angular) {
	'use strict';

	var HomeController = function ($scope, fooService) {
		fooService.query(function (data) {
			$scope.foo = data;
		});
	};

	HomeController.$inject = ['$scope', 'FooService'];

	angular.module('app.controllers').controller('HomeController', HomeController);
})(angular);
