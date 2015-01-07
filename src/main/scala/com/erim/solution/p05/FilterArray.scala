package com.erim.solution.p05

object FilterArray {

  def f(delim:Int,arr:List[Int]):List[Int] = arr match {
    case Nil => Nil;
    case head :: tail => if(filter(delim, head)) head :: f(delim, tail) else f(delim, tail)
  }

  def filter(delim : Int, value: Int) = delim > value

}
