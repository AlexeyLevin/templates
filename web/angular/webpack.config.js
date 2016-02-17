'use strict';

const webpack = require('webpack');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const config = {
	context: __dirname + '/src',
	entry: {
		bundle: './index.js',
		vendor: [
			'angular',
			'angular-ui-router',
			'angular-bootstrap',
			'angular-resource'
		]
	},
	output: {
		path: __dirname + '/src',
		filename: 'bundle.js'
	},

	devtool: 'inline-source-map',

	plugins: [
		new webpack.DefinePlugin({
			TEST: process.env.NODE_ENV === 'test',
			DEBUG: true
		}),
		new webpack.optimize.CommonsChunkPlugin('vendor', 'vendor.bundle.js'),
		new HtmlWebpackPlugin({
			template: 'index.html',
		})
	],

	module: {
		loaders: [
			{test: /\.html$/, loader: 'raw'},
			{test: /\.css$/, loader: 'style!css'},
			{test: /\.png$/, loader: 'url?limit=100000'},
			{
				test: /\.woff(2)?(\?v=[0-9]\.[0-9]\.[0-9])?$/,
				loader: "url-loader?limit=10000&mimetype=application/font-woff"
			},
			{
				test: /\.(ttf|eot|svg)(\?v=[0-9]\.[0-9]\.[0-9])?$/,
				loader: "file-loader"
			}
		]
	}
};

if (process.env.NODE_ENV === 'production') {
	config.plugins = [
		new webpack.DefinePlugin({
			DEBUG: false
		}),
		new webpack.optimize.CommonsChunkPlugin('vendor', '[hash].vendor.bundle.js'),
		new HtmlWebpackPlugin({
			template: 'index.html',
			hash: true,
			minify: {
				removeComments: true,
				collapseWhitespace: true
			}
		})
	]

	config.output.path = __dirname + '/dist';
	config.output.filename = '[hash].bundle.js';
	config.plugins.push(new webpack.optimize.UglifyJsPlugin({
		compress: {
			warnings: false
		}
	}));
	config.devtool = 'source-map';
}

module.exports = config;
