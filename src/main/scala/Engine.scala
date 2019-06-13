package org.example.recommendation

import org.apache.predictionio.controller.EngineFactory
import org.apache.predictionio.controller.Engine

/**
  * 用户ID和查询数量
  **/
case class Query(
  user: String,
  num: Int
)

/**
  * ItemScore的数组
  **/
case class PredictedResult(
  itemScores: Array[ItemScore]
)

/**
  * 物品的ID和评分
  */
case class ItemScore(
  item: String,
  score: Double
)
/**查询返回记过示例
  * {"itemScores":[
  * {"item":22,"score":4.07},
  * {"item":62,"score":4.05},
  * {"item":75,"score":4.04},
  * {"item":68,"score":3.81}
  * ]}
  * */

/**
  * 执行结果，Rating类型的数组。
  * 用户ID
  * 物品ID
  * 评分
  **/
case class ActualResult(
                         ratings: Array[Rating]
                       )

/**
  * 自定义实现的推荐引擎.
  * 使用DataSource，Preparator，ALSAlgorithm和Serving
  **/
object RecommendationEngine extends EngineFactory {
  def apply() = {
    /**
      *
      * */
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("als" -> classOf[ALSAlgorithm]),
      classOf[Serving])
  }
}
