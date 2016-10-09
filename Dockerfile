# lappsgrid/vassar
#
# This image extends the tomcat7 image and adds the Lapps services running
# on the Vassar node.

FROM lappsgrid/tomcat7:1.1.0

ADD ./packages/*.tgz /var/lib/tomcat7/webapps
