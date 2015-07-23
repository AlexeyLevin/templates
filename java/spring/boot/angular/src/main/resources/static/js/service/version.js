angular.module('app.service').factory('version', function ($resource) {
	'use strict';

	return $resource('/api/version');
});
