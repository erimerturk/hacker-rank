package com.erim.solution

object ReverseList {

  def f(arr:List[Int]):List[Int] = {

    def f(arr:List[Int], newList:List[Int]):List[Int] = arr match {
      case Nil => newList
      case head :: tail => f(tail, head :: newList)
    }
    f(arr, Nil)
  }

}
