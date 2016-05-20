module.exports = function () {
	'use strict';

	var angular = require('angular');
	require('angular-ui-router');
	require('angular-bootstrap');
	require('angular-resource');

	angular.module('app.controllers', ['ui.bootstrap']);
	angular.module('app.services', ['ngResource']);

	angular.module('app', ['app.controllers', 'app.services', 'ui.router']);

	require('./router')(angular);
	require('./about/about-controller')(angular);
	require('./home/foo-service')(angular);
	require('./home/home-controller')(angular);

	function Initializer($state, $log) {
		$log.log('debug: ' + DEBUG);
		if (!DEBUG) {
			angular.module('app').config(function ($compileProvider) {
				$compileProvider.debugInfoEnabled(false);
			});
		}

		angular.element(document).ready(function () {
			$state.go('home', {});
		});
	};
	Initializer.$inject = ['$state', '$log'];
	angular.module('app').run(Initializer);
};
