package util

import model.SimplePoint

object FeatureScaler {

  def scaledDividedByMax(data: List[SimplePoint]): List[SimplePoint] = ???

  def minMaxScaledData(data: List[SimplePoint]): List[SimplePoint] = ???

  def avg(nums: List[Double]): Double = nums.sum / nums.length

  def meanNormalisedData(data: List[SimplePoint]): List[SimplePoint] = {
    val mean = avg(data.map(_.x))
    val range = data.map(_.x).max - data.map(_.x).min
    data.map { point =>
      SimplePoint((point.x - mean) / range, point.y)
    }
  }
}
