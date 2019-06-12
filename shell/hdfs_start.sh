#!/bin/bash
# 启动hdfs
HADOOP_PATH="${HADOOP_HOME}/sbin"

${HADOOP_PATH}/start-dfs.sh
${HADOOP_PATH}/mr-jobhistory-daemon.sh start historyserver
${HADOOP_PATH}/start-yarn.sh
