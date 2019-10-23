#!/bin/bash
export JAVA_HOME=/usr/lib/jvm/java-7-oracle
export JRE_HOME=${JAVA_HOME}/jre
export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib
export PATH=${JAVA_HOME}/bin:$PATH

ps -ef | grep b2c-cloud-test-sys | grep -v grep | awk '{print $2}' | xargs kill -9

nohup /usr/lib/jvm/java-7-oracle/bin/java -Xms128m -Xmx128m -jar -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 b2c-cloud-test-sys-2.0.0-SNAPSHOT.jar >sys.log 2>&1 &