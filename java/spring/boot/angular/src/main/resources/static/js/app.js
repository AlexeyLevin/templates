var app = angular.module('app', ['app.controller', 'app.service', 'ui.router']);
angular.module('app.controller', ['ui.bootstrap']);
angular.module('app.service', ['ngResource']);

app.config(function($stateProvider, $urlRouterProvider) {
	'use strict';

	$urlRouterProvider.otherwise("/");

	$stateProvider
		.state('main', {
			url: '/',
			templateUrl: 'view/main.html',
			controller: 'main'
		})
		.state('about', {
			url: '/about',
			templateUrl: 'view/about.html',
			controller: 'about'
		});
}).run(function($state) {
	$state.go('main');
});
