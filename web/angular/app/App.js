(function (angular) {
	'use strict';

	angular.module('app.controllers', ['ui.bootstrap']);
	angular.module('app.services', ['ngResource']);

	var app = angular.module('app', ['app.controllers', 'app.services', 'ui.router']);

	var Router = function ($stateProvider, $urlRouterProvider) {
		$urlRouterProvider.otherwise("/");

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

	var Initializer = function($state) {
		angular.element(document).ready(function() {
			$state.go('home', {});
		})
	};
	Initializer.$inject = ['$state'];
	app.run(Initializer);
})(angular);
