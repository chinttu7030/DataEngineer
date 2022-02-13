package com.Udemy

object demo1 extends App {


  def square(x: Double): Double = {
    x * x
  }

  println(square(4.5))


  def greeting(name: String): Unit = {
    println(s"Hello,$name")

  }

  greeting("mark")


  def factorial(n: Int): Int = if (n < 2) 1 else n * factorial(n - 1)


  println(factorial(4))


  def estimatepi(n: Int): Double = {
    def helper(n: Int): Double = {
      if (n < 1) 0 else {
        val x = math.random()
        val y = math.random()
        (if (x * x + y * y < 1) 1 else 0) + helper(n - 1)

      }
    }

    helper(n) / n * 4
  }

  estimatepi(20)


}
