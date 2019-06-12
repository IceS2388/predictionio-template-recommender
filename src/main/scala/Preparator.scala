package org.example.recommendation

import org.apache.predictionio.controller.PPreparator

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
/**
  * Preparator处理数据，把数据传递给算法和模型。
  * */
class Preparator
  extends PPreparator[TrainingData, PreparedData] {

  override
  def prepare(sc: SparkContext, trainingData: TrainingData): PreparedData = {
    new PreparedData(ratings = trainingData.ratings)
  }
}

class PreparedData(
  val ratings: RDD[Rating]
) extends Serializable
