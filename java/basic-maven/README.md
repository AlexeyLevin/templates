Template for Java Basic Project
=====================

Template for Java basic project with [Maven](https://maven.apache.org) and [Logback](http://logback.qos.ch)

### Run
```
mvn compile exec:java
```

### Create executable jar with dependencies
```
mvn package assembly:single
```

### Update plugins and dependencies
```
mvn versions:update-properties
```
