FROM amazoncorretto:8-alpine3.17-jre

EXPOSE 8080 

COPY ./target/test-java-*.jar    /usr/app/

WORKDIR /usr/app/

CMD java -jar test-java-*.jar 
