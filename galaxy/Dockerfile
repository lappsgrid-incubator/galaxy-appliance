# Lappsgrid Galaxy Flavour 
#

FROM bgruening/galaxy-stable

MAINTAINER Keith Suderman, suderman@cs.vassar.edu

ENV BARE=True
ENV GALAXY_CONFIG_BRAND="LAPPS" 


ENV TERM=xterm

RUN apt-get update && apt-get install -y bash emacs24-nox 

ADD ./packages/lsd-latest.tgz /usr/bin
RUN chmod a+x /usr/bin/lsd

ADD ./packages/brat.tgz /galaxy-central/config/plugins/visualizations

ADD ./welcome.html /etc/galaxy/web/welcome.html
ADD ./tool_conf.xml /galaxy-central/config/tool_conf.xml
ADD ./job_conf.xml /etc/galaxy/job_conf.xml
ADD ./galaxy.ini /etc/galaxy/galaxy.ini
ADD ./galaxy.ini /galaxy-central/config/galaxy.ini

ADD ./datatypes_conf.xml /galaxy-central/config/datatypes_conf.xml
ADD ./text.py /galaxy-central/lib/galaxy/datatypes/text.py
ADD ./tools /galaxy-central/tools
     
WORKDIR /galaxy-central

# Mark folders as imported from the host.
VOLUME ["/export/", "/data/", "/var/lib/docker"]

# Expose port 80 (webserver), 21 (FTP server), 8800 (Proxy)
EXPOSE :80
EXPOSE :21
EXPOSE :22
EXPOSE :8800
EXPOSE :9002

# Autostart script that is invoked during container start
ADD ./startup.sh /usr/bin/startup
CMD ["/usr/bin/startup"]    
    
