Template for Java Jetty embedded Project
=====================

Template for [Jetty](http://eclipse.org/jetty/) embedded project with [Maven](http://maven.apache.org).

### Run ###
```
mvn compile exec:java
```
or
```
mvn jetty:run
```

### Create executable jar with dependencies ###
```
mvn package assembly:single
```
