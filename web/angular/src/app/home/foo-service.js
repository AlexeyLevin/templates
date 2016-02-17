module.exports = function(angular) {
	'use strict';

	angular.module('app.services').factory('FooServiceFactory', FooServiceFactory);

	function FooServiceFactory() {
		return {
			data: [{message: 'Foo'}, {message: 'Bar'}, {message: 'Buz'}]
		};
	};
};
