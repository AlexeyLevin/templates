'use strict';

if (require.main === module) {
	registerHooks();

	console.log('foo');
}

function registerHooks() {
	process.on('unhandledRejection', (reason, obj) => {
		console.error('Unhandled Rejection at: [%s] reason: %s', obj, reason);
	});

	process.on('uncaughtException', (reason, obj) => {
		console.error('Unhandled Exception at: [%s] reason: %s', obj, reason);
	});
}
