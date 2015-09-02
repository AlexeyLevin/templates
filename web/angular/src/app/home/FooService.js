(function (angular) {
	'use strict';

	var FooService = function () {
		return function() {
			return [{message: "Foo"}, {message: "Bar"}, {message: "Buz"}];
		}
	};

	angular.module('app.services').factory('FooService', FooService);
})(angular);
