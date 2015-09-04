'use strict';

var gulp = require('gulp'),
	concat = require('gulp-concat'),
	addsrc = require("gulp-add-src"),
	filter = require('gulp-filter'),
	useref = require('gulp-useref'),
	uglify = require('gulp-uglify'),
	minifyCss = require('gulp-minify-css'),
	minifyHtml = require('gulp-minify-html'),
	templateCache = require('gulp-angular-templatecache'),
	ngConstant = require('gulp-ng-constant'),
	rev = require('gulp-rev'),
	revReplace = require('gulp-rev-replace'),
	run = require('run-sequence'),
	del = require('del');

gulp.task('config', function () {
	gulp.src('src/config.json')
		.pipe(ngConstant())
		.pipe(gulp.dest('tmp'));
});

gulp.task('templates', function() {
	return gulp.src('src/**/_*.html')
		.pipe(minifyHtml({empty: true}))
		.pipe(templateCache())
		.pipe(gulp.dest('tmp'));
});

gulp.task('useref', ['config', 'templates'], function() {
	var assets = useref.assets();
	var js = filter('**/*.js', {restore: true});
	var css = filter('**/*.css', {restore: true});
	var index = filter('**/index.html', {restore: true});

	return gulp.src('src/index.html')
		.pipe(assets)

		.pipe(js)
		.pipe(addsrc.append('tmp/templates.js'))
		.pipe(addsrc.append('tmp/config.js'))
		.pipe(concat('js/bundle.js'))
		.pipe(uglify())
		.pipe(rev())
		.pipe(js.restore)

		.pipe(css)
		.pipe(minifyCss())
		.pipe(rev())
		.pipe(css.restore)

		.pipe(assets.restore())

		.pipe(useref())
		.pipe(revReplace())

		.pipe(index)
		.pipe(minifyHtml({empty: true}))
		.pipe(index.restore)

		.pipe(gulp.dest('dist'));
});

gulp.task('tmp', function () {
	del(['tmp']);
});

gulp.task('default', function(c) {
	run('useref', 'tmp', c);
});

gulp.task('clean', function () {
	del(['dist']);
});
