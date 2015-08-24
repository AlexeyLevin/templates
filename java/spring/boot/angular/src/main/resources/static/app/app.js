var app = angular.module('app', ['controllers', 'services', 'ui.router']);
angular.module('controllers', ['ui.bootstrap']);
angular.module('services', ['ngResource']);

app.config(
	['$stateProvider', '$urlRouterProvider',
		function ($stateProvider, $urlRouterProvider) {
			'use strict';

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
		}]).run(['$state', function ($state) {
		$state.go('home');
	}]);
