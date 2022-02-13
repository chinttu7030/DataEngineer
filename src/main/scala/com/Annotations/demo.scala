package com.Annotations

import scala.annotation.tailrec

object demo extends App {

  //  def factorial(x: Int): Int = {
  //    def factorialHelper(x: Int): Int = {
  //      if (x == 1) 1 else x * factorialHelper(x - 1)
  //    }
  //    factorialHelper(2)
  //  }


  def factorial(x: Int): Int = {

    @tailrec
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
    }

    factorialHelper(x, 1)
  }

}
