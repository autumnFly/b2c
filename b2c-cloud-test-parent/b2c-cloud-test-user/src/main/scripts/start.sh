#!/bin/bash
echo "Application ${APPLICATION_NAME} starting, please wait..."
JAVA_OPTS="-Xms256m -Xmx512m"
nohup /usr/java/jdk1.8.0_92/bin/java -jar ${APPLICATION_NAME}.jar ${JAVA_OPTS} 1>/dev/null 2>&1  &

# 检测应用是否启动成功
detectApplication(){
    sleep 15
    curl --connect-timeout 3 -m 3 -i ${DETECT_URL}
    CURL_CODE=$?
    echo curl code:${CURL_CODE}
    TRY_TIMES=10
    CUR_TIMES=1
    while [[ ${CURL_CODE} != 0 ]]; do
        if [[ ${CUR_TIMES} -lt ${TRY_TIMES} ]]; then
            echo "try connect ${CUR_TIMES} times..."
            curl --connect-timeout 3 -m 3 -i ${DETECT_URL}
            CURL_CODE=$?
            echo curl code:${CURL_CODE}
            CUR_TIMES=$[${CUR_TIMES}+1]
            sleep 3
        else
            break
        fi
    done
    if [[ ${CURL_CODE} == 0 ]]; then
        echo "Application ${APPLICATION_NAME} start success."
        tail -n 300 logs/${APPLICATION_NAME}.log
    else
        echo "Application ${APPLICATION_NAME} start failed."
        tail -n 1500 logs/${APPLICATION_NAME}.log
    fi
}
detectApplication