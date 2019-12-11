FROM huanwei/supervisor-jdk8:v1
MAINTAINER Huan Wei<huan@harmonycloud.cn>

RUN mkdir -p /harmonycloud/bin
RUN mkdir -p /harmonycloud/tmp
RUN mkdir -p /harmonycloud/tmp/config
RUN mkdir -p /harmonycloud/tmp/logs

ADD springboot.ini /etc/supervisord.d/springboot.ini
ADD task-demo-1.0-SNAPSHOT.jar /harmonycloud/tmp/
ADD config /harmonycloud/tmp/config
ADD start.sh /harmonycloud/bin/start.sh
RUN chmod +x /harmonycloud/bin/start.sh