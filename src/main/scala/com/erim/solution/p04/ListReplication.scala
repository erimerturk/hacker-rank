package com.erim.solution.p04

object ListReplication {

  def replicate(num:Int,arr:List[Int]):List[Int] = arr.flatMap(List.fill(num) (_))

}
