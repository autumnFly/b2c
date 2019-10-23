#!/bin/bash
PID=$(ps -ef | grep ${APPLICATION_NAME}.jar | grep -v grep | awk '{ print $2 }')
echo the pid is:${PID}
if [ -z "${PID}" ]; then
    echo Application ${APPLICATION_NAME} is already stopped.
else
	ps -ef | grep ${APPLICATION_NAME}.jar | grep -v grep | awk '{ print $2 }' |while read PID
    do
		kill -9 ${PID}
		echo "${APPLICATION_NAME} stopping, pid is:${PID}，please wait..."
	done
	echo Application ${PID} ${APPLICATION_NAME} stopped success.
fi
