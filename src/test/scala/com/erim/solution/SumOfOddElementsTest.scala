package com.erim.solution

import org.scalatest.{FlatSpec, Matchers, FunSuite}

class SumOfOddElementsTest extends FlatSpec with Matchers {

  "Util " should " sum odd elements " in {

    SumOfOddElements.f(List(3, 2 ,4 ,6 ,5 ,7 ,8 ,0 ,1)) should equal(16)
    SumOfOddElements.f(List(4 ,6 ,5 ,7 ,8 ,0 ,1)) should equal(13)
    SumOfOddElements.f(List(11 ,25 ,18 ,-1 ,26 ,-20 ,-19 ,23 ,-24 ,-8)) should equal(39)
    SumOfOddElements.f(List(2,4)) should equal(0)

  }

}
