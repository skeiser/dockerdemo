FROM tomcat:7-jre8
ADD tomcat-users.xml /usr/local/tomcat/conf

ADD demo.xml /usr/local/tomcat/conf/Catalina/localhost/

RUN mkdir /warfiles && apt-get update && apt-get install -y iputils-ping inetutils-traceroute inetutils-telnet iproute2 net-tools

ADD demo.war /warfiles
EXPOSE 8080

CMD ["catalina.sh", "run"]
