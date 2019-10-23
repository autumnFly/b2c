#!/bin/bash
echo "Application ${APPLICATION_NAME} starting..."
JAVA_OPTS="-Xms256m -Xmx512m"
nohup /usr/java/jdk1.8.0_92/bin/java -jar ${APPLICATION_NAME}.jar ${JAVA_OPTS} >boot-log.log 2>&1  &
curl -i ${DETECT_URL}
CURL_CODE=$?
echo curl code:${CURL_CODE}
TRY_TIMES=50
CUR_TIMES=1
while [ ${CURL_CODE} != 0 ]; do
    if [ ${CUR_TIMES} -lt ${TRY_TIMES} ]; then
        echo try connect ${CUR_TIMES} times...
        curl -i ${DETECT_URL}
        CURL_CODE=$?
        echo curl code:${CURL_CODE}
        CUR_TIMES=$[${CUR_TIMES}+1]
    else
        break
    fi
done
if [ ${CURL_CODE} == 0 ]; then
    echo Application start success.
else
    echo Application start failed.
fi
