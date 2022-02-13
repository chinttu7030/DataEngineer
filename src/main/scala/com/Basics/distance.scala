package com.Basics

object distance extends App {


  //Scala has a special class called "Case Class" these instances are immutable and they are compared by value


  val compare = Compare(1, 2)
  val aCompare = Compare(3, 4)
  val bCompare = Compare(1, 2)


  if (compare == aCompare) {

    println(s"$compare and $aCompare are the same")
  } else {
    println(s"$compare and $aCompare are different")
  }

  if (compare == bCompare) {
    println(s"$compare and $bCompare are same")
  } else {
    println(s"$compare and $bCompare are different")
  }

}
