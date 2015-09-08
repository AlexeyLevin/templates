(function (angular) {
	'use strict';

	angular.module('config', []);
	angular.module('templates', []);
	angular.module('app.controllers', ['ui.bootstrap']);
	angular.module('app.services', ['ngResource']);

	var app = angular.module('app', ['config', 'templates',
		'app.controllers', 'app.services', 'ui.router']);

	var Router = function ($stateProvider, $urlRouterProvider) {
		$urlRouterProvider.otherwise('/');

		$stateProvider
			.state('home', {
				url: '/',
				templateUrl: 'app/home/_home.html',
				controller: 'HomeController'
			})
			.state('about', {
				url: '/about',
				templateUrl: 'app/about/_about.html',
				controller: 'AboutController'
			});
	};

	Router.$inject = ['$stateProvider', '$urlRouterProvider'];
	app.config(Router);

	var Initializer = function($state, $injector, $log) {
		var production;

		try {
			production = $injector.get('production');
		} catch (e) {
			$log.log('Constant "production" not defined', e);
		}

		if (production) {
			$log.log('production: ' + production);
			app.config(['$compileProvider', function ($compileProvider) {
				$compileProvider.debugInfoEnabled(false);
			}]);
		}

		angular.element(document).ready(function() {
			$state.go('home', {});
		})
	};
	Initializer.$inject = ['$state', '$injector', '$log'];
	app.run(Initializer);
})(angular);
