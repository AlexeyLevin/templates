module.exports = function(angular) {
	'use strict';

	AboutController.$inject = ['$scope'];
	angular.module('app.controllers').controller('AboutController', AboutController);

	function AboutController($scope) {
		var vm = this;
		vm.production = !DEBUG;
		vm.app = {name: 'foo', version: '0.1', description: 'bar'};
	};
};
