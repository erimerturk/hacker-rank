package com.erim.solution.p05

import org.scalatest.{FlatSpec, Matchers}

class FilterArrayTest extends FlatSpec with Matchers {

  "FilterArray" should "filter by delimineter " in {

    val result = FilterArray.f(3, List(1,2,4,5,6,7))

    result should contain theSameElementsAs List(1,2)

    FilterArray.f(5, List(1,2,4,5,6,7)) should contain theSameElementsAs List(1,2,4)

    FilterArray.f(5, Nil) should be (Nil)

    FilterArray.f(5, List(5,6,7,1,2,10)) should contain theSameElementsAs List(1,2)

  }

}
