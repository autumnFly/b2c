#!/bin/bash
export APPLICATION_NAME="b2c-cloud-test-user-2.0.0-SNAPSHOT"
export DETECT_URL="http://localhost:8999"
echo Stopping application ${APPLICATION_NAME}...
source stop.sh
echo Starting application ${APPLICATION_NAME}...
source start.sh
