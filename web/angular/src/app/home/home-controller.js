module.exports = function(angular) {
	'use strict';

	HomeController.$inject = ['$scope', 'FooServiceFactory'];
	angular.module('app.controllers').controller('HomeController', HomeController);

	function HomeController($scope, fooService) {
		var vm = this;
		vm.foo = fooService.data;
	};
};
