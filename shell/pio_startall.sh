#!/bin/bash
# 一键启动pio

hdfs_start.sh
sleep 30
${SPARK_HOME}/sbin/start-all.sh
${HBASE_HOME}/bin/start-hbase.sh
${EL_HOME}/bin/elasticsearch -d &
sleep 60
pio eventserver &
sleep 10
pio status
