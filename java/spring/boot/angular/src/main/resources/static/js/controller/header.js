angular.module('app.controller').
controller('header', function($scope, $location) {
	'use strict';

	$scope.isActive = function (viewLocation) {
		return viewLocation === $location.path();
	};
});
