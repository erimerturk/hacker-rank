package com.erim.solution.p03

object HelloWorldNTimes {

  def f(n: Int) = (0 to n).filter(i => i > 0 && i <= 50).foreach( i=> println("Hello World"))

}
