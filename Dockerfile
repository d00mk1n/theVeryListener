FROM tomcat:8.0.20-jre8
COPY target/listener-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/listener.war
COPY google2fc63c26b515071b.html /usr/local/tomcat/webapps/myapp/google2fc63c26b515071b.html
COPY tomcat-users.xml $CATALINA_HOME/conf/tomcat-users.xml