FROM openjdk:8-jre

LABEL maintainer="Michael Senn <michael@senn.email>"

EXPOSE 8080

# Tiny Init. (Reap zombies, forward signals)
ENV TINI_VERSION v0.15.0
ADD https://github.com/krallin/tini/releases/download/${TINI_VERSION}/tini /tini
RUN chmod +x /tini

# Create non-privileged user
RUN groupadd -r shipme && useradd -r -g shipme shipme

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY docker-entrypoint.sh /usr/src/app/
COPY build/libs/shipme*.jar /usr/src/app/shipme.jar

RUN chmod +x "./docker-entrypoint.sh"

USER shipme
ENTRYPOINT ["/tini", "--", "./docker-entrypoint.sh"]
