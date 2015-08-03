/** @jsx React.DOM */

'use strict';

require('./css/style.css');

var React = require('react');
var App = require('./app');

React.render(<App/>, document.getElementById('content'));
