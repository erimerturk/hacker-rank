package com.erim.solution

import org.scalatest.{Matchers, FlatSpec}

class ArrayOfNElementsTest extends FlatSpec with Matchers {

  "Creator" should " be succeed" in {

    ArrayOfNElements.f(3) should have size 3
    ArrayOfNElements.f(0) should have size 0
    ArrayOfNElements.f(6) should have size 6

  }

}
