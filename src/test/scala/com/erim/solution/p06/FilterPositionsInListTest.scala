package com.erim.solution.p06

import org.scalatest.{FlatSpec, Matchers}

class FilterPositionsInListTest extends FlatSpec with Matchers {

  "Filter Positions in List" should "filter" in {

    FilterPositionsInList.f(List(1,2,4,5,6,7)) should contain theSameElementsAs List(2,5,7)
    FilterPositionsInList.f(List(1)) should contain theSameElementsAs List()
    FilterPositionsInList.f(List()) should contain theSameElementsAs List()

  }

}
