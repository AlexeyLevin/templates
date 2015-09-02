'use strict';

var gulp = require('gulp');
var concat = require('gulp-concat');
var usemin = require('gulp-usemin');
var uglify = require('gulp-uglify');
var minifyCss = require('gulp-minify-css');
var rimraf = require('gulp-rimraf');
var angularTemplateCache = require('gulp-angular-templatecache');
var runSequence = require('run-sequence');

gulp.task('default', function(callback) {
	runSequence('usemin', 'templates', 'merge', 'tmp', callback);
});

gulp.task('usemin', function() {
	return gulp.src('src/index.html')
		.pipe(usemin({
			assetsDir: 'src',
			css: [minifyCss(), 'concat'],
			js: [uglify(), 'concat']
		}))
		.pipe(gulp.dest('dist/'));
});

gulp.task('templates', function() {
	return gulp.src('src/**/_*.html')
		.pipe(angularTemplateCache())
		.pipe(uglify())
		.pipe(gulp.dest('tmp/'));
});

gulp.task('merge', function() {
	gulp.src(['dist/js/bundle.js', 'tmp/templates.js'])
		.pipe(concat('bundle.js'))
		.pipe(gulp.dest('dist/js/'));
});

gulp.task('tmp', function (cb) {
	return gulp.src('tmp')
		.pipe(rimraf());
});

gulp.task('clean', function (cb) {
	return gulp.src('dist')
		.pipe(rimraf());
});
