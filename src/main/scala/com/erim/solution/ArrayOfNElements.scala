package com.erim.solution

import scala.util.Random

object ArrayOfNElements {


  def f(num:Int) : List[Int] = num > 0 match {
      case false => List()
      case true => Random.nextInt() :: f(num - 1)
    }


}
