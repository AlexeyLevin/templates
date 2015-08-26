(function (angular) {
	'use strict';

	angular.module('app.controllers', ['ui.bootstrap']);
	angular.module('app.services', ['ngResource']);

	var app = angular.module('app', ['app.controllers', 'app.services', 'ui.router']);

	app.config(
		['$stateProvider', '$urlRouterProvider',
			function ($stateProvider, $urlRouterProvider) {
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
					})
			}]).run(['$state', function ($state) {
			$state.go('home');
		}]);
})(angular);
