package com.erim.solution

import org.scalatest.{Matchers, FlatSpec, FunSuite}

class ReverseListTest extends FlatSpec with Matchers {

  "Util" should "reverse" in {

    ReverseList.f(List(1,3)) should equal( List(3,1))
    ReverseList.f(List(1,3,4)) should equal( List(4,3,1))

  }

}
