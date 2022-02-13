package com.Basics

object Functions extends App {

  // Functions are Expressions that have parameters and take arguments

  val addOne = (x: Int) => x + 1 //function with one parameter
  println(addOne(10))


  val addTwoNumbers = (x: Int, y: Int) => x + y
  //function with multiple parameter
  println(addTwoNumbers(10, 20))


  val gettheanswer = () => 100 //function with no parameter
  println(gettheanswer())


}
