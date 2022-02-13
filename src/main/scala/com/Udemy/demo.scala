package com.Udemy

object demo extends App {


  val a = 5
  var b = 6
  var i = 5
  println("Hello dev")

  if (a < 9) println("Bigger")

  val next = if (a % 2 == 0) a / 2 else 3 * a + 1

  println(next)


  if (a > 9) 4 else 7


  val result = a match {
    case 0 => "zero"
    case 1 => "one"
    case 'b' => "same as b" //we need to write in the '' for the case statement to avoid printing the variable
    case _ => "something bigger"
  }
  println(result)


  val resultR = (a * 3, b) match {
    case (0, _) => "zero"
    case (0, 1) => "bigger"
    case i => "anything"
  }
  println(resultR)


}
