package com.NameParameters

object demo extends App {


  def whileLoop(condition: => Boolean)(body: => Unit): Unit =
    if (condition) {
      body
      whileLoop(condition)(body)
    }

  var i = 2
  whileLoop(i > 0) {
    println(i)
    i -= 1
  }


}
