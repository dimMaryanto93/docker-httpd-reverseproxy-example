FROM ubuntu:16.04

env java_project /opt
env apache2_project /var/www/html
env apache2_proxy /etc/apache2/sites-enabled

RUN apt-get update && apt-get install apache2 -y
RUN ["/etc/init.d/apache2", "restart"]

VOLUME ${java_project}
VOLUME ${apache2_project}
VOLUME ${apache2_proxy}

EXPOSE 80 433 8080