package com.erim.solution

object SumOfOddElements {

  def f(arr: List[Int]): Int = arr match {
    case Nil => 0
    case _ => arr
      .filter(each => (each % 2) == 1)
      .filter(each => each >= -100 && each <= 100)
      .sum
  }
}
