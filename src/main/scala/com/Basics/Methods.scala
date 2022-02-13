package com.Basics

object Methods extends App {

  // Methods are similar to functions
  //Methods are defined with the def keyword
  //def is followed by name, parameter, return type and body


  def add(x: Int, y: Int): Int = x + y //two parameters method

  println(add(100, 200))


  def addandMultiplier(a: Int, b: Int)(multiplier: Int): Int = (a + b) * multiplier //multiple paameters in methods

  println(addandMultiplier(2, 5)(7))


  def name: String = System.getProperty("user.name")

  println("hello, " + name + "!") //no parameter list


  def getSquareString(input: Double): String = {

    val square: Double = input * input //Methods can have multi line Expressions
    square.toString
    //square


  }

  println(getSquareString(2.6))


}
