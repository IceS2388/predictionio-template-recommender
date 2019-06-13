package org.example.recommendation

import org.apache.predictionio.controller.PPreparator

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
/**
  * Preparator处理数据，把数据传递给算法和模型。
  * */
class Preparator
  extends PPreparator[TrainingData, PreparedData] {

  /**简单把数据封装一下*/
  override
  def prepare(sc: SparkContext, trainingData: TrainingData): PreparedData = {

    new PreparedData(ratings = trainingData.ratings)
  }
}
/**
  * 一个可序列化的只包含ratings的RDD
  * */
class PreparedData(
  val ratings: RDD[Rating]
) extends Serializable
