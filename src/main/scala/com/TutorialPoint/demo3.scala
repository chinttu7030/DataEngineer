package com.TutorialPoint

object demo3 extends App {


  //Closure :A closure is a function, whose return value depends on the value of one or more variables declared outside this function.
  val i = 4
  val multiplier = (i: Int) => i * 10
  println(i)


}
