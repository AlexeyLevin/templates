angular.module('app.service').factory('foo', function ($resource) {
	'use strict';

	return $resource('/api/foo');
});
