FROM openjdk:11.0.6-jre-buster

ENV APP_HOME="app"
ENV APP_JAR="demo.jar"
ENV JAVA_OPTS=""

COPY target/demo-*.jar $APP_HOME/$APP_JAR

ENTRYPOINT java $JAVA_OPTS -jar $APP_HOME/$APP_JAR
