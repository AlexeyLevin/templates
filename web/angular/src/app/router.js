module.exports = function(angular) {
	'use strict';

	function Router($stateProvider, $urlRouterProvider) {
		$urlRouterProvider.otherwise('/');

		$stateProvider
			.state('home', {
				url: '/',
				template: require('./home/_home.html'),
				controller: 'HomeController as home'
			})
			.state('about', {
				url: '/about',
				template: require('./about/_about.html'),
				controller: 'AboutController as about'
			});
	};

	Router.$inject = ['$stateProvider', '$urlRouterProvider'];
	angular.module('app').config(Router);
}
