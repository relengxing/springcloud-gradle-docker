FROM java:openjdk-8-alpine
MAINTAINER chaolee(chao.lee@percolata.com)

VOLUME /tmp
ADD jar-eureka-1.0.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
#EXPOSE 6001