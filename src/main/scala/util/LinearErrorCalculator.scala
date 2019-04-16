package util

import breeze.numerics.pow
import model.SimplePoint

object LinearErrorCalculator {

  def linearMeanSquaredError(
      data: List[SimplePoint],
      theta0: Double,
      theta1: Double
  ): Double = {
    data
      .map(point => pow((theta0 + theta1 * point.x) - point.y, 2))
      .sum / (2 * data.length)
  }
}
