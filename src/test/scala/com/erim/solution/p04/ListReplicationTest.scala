package com.erim.solution.p04

import org.scalatest.{Matchers, FlatSpec}

class ListReplicationTest extends FlatSpec with Matchers {

  "A List with one element and one time" should "be replicated" in {

    val output = List(1)

    val result = ListReplication.replicate(1, List(1))

    result should contain theSameElementsAs output


  }

  "A List with one element and two time" should "be replicated " in {

    val output = List(1,1)

    val result = ListReplication.replicate(2, List(1))

    result should contain theSameElementsAs output


  }

  "A List with many element and three time" should "be replicated " in {

    val output = List(1,1,1,2,2,2,3,3,3,4,4,4)

    val result = ListReplication.replicate(3, List(1,2,3,4))

    result should contain theSameElementsAs output


  }

}
