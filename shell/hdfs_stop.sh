#!/bin/bash
# 停止hdfs

HADOOP_PATH="${HADOOP_HOME}/sbin"

${HADOOP_PATH}/stop-yarn.sh
${HADOOP_PATH}/mr-jobhistory-daemon.sh stop historyserver
${HADOOP_PATH}/stop-dfs.sh
