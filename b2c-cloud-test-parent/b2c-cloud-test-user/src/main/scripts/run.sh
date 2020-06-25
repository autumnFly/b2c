#!/bin/bash
# 找到jar包名称
export APPLICATION_NAME=`ls | grep .jar | sed s/".jar"/""/`

unzip -j ${APPLICATION_NAME}.jar BOOT-INF/classes/application.yml
# 读取application.yml文件找到应用启动的端口号
APPLICATION_PORT=`cat application.yml | grep -w '^  port'| cut -d':' -f2 | sed -e 's/\(^[ \t] *\)//' | sed 's/\r//'`
rm -rf application.yml

# 找到当前机器的ip地址
IP_ADDRESS=`ip addr | grep 'state UP' -A2 | tail -n1 | awk '{print $2}' | cut -f1 -d '/'`

export DETECT_URL="http://${IP_ADDRESS:-localhost}:${APPLICATION_PORT}/info"

source stop.sh
source start.sh
