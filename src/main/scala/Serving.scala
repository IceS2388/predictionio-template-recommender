package org.example.recommendation

import org.apache.predictionio.controller.LServing
/**
  * Serving获取预测的查询结果。如果引擎有多重算法，Serving会将结果合并为一个。
  * 此外，可以在“服务”中添加特定于业务的逻辑，以进一步自定义最终返回的结果。
  * */
class Serving
  extends LServing[Query, PredictedResult] {

  override
  def serve(query: Query,
    predictedResults: Seq[PredictedResult]): PredictedResult = {
    predictedResults.head
  }
}
