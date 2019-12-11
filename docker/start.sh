#!/bin/bash

if [  -d "/harmonycloud/tmp" ]; then
    mkdir -p /harmonycloud/task-demo
    cp -r  /harmonycloud/bin /harmonycloud/task-demo/
    cp -r  /harmonycloud/tmp/* /harmonycloud/task-demo/
    rm -rf /harmonycloud/tmp
fi

cd /harmonycloud/task-demo
nohup java -jar task-demo-1.0-SNAPSHOT.jar --spring.config.location=/harmonycloud/task-demo/config/application.properties &
sleep 1