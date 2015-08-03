var path = require('path');

module.exports = {
	context: path.join(__dirname, 'src'),

    entry: "./index.jsx",

	output: {
        path: path.join(__dirname, 'js'),
        filename: "bundle.js"
    },

	resolve: {
		modulesDirectories: ['node_modules', './src'],
		extensions: ['', '.js', '.jsx']
	},

    module: {
        loaders: [
            { test: /\.html$/, loader: "raw" },
            { test: /\.css$/, loader: "style!css" },
			{ test: /\.(png|woff|woff2|eot|ttf|svg)$/, loader: 'url?limit=100000' },
			{ test: /\.jsx?$/, loader: 'jsx' }
		]
    },
    resolveLoader: {
        modulesDirectories: [
            '/usr/local/lib/node_modules'
        ]
    }
};
