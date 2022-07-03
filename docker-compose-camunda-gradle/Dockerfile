FROM gradle:6.8.0 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon
FROM openjdk
EXPOSE 8000
RUN mkdir /app
ARG DB_SERVER_NAMES
ENV DB_SERVER_NAMES=${DB_SERVER_NAMES}


ARG DS_PORT_NUMBERS
ENV DS_PORT_NUMBERS=${DS_PORT_NUMBERS}

ARG DS_DATABASE_NAME
ENV DS_DATABASE_NAME=${DS_DATABASE_NAME}

ARG DS_USER
ENV DS_USER=${DS_USER}

ARG DS_PASSWORD
ENV DS_PASSWORD=${DS_PASSWORD}

ARG DS_SCHEMA
ENV DS_SCHEMA=${DS_SCHEMA}

COPY --from=build /home/gradle/src/build/libs/*.jar /app/kotlin-docker-gradle-app.jar
ENTRYPOINT ["java","-jar","/app/kotlin-docker-gradle-app.jar"]
