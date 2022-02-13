package com.Comprehensions

object demo extends App {


  val userBase = List(
    User("Travis", 28),
    User("Kelly", 33),
    User("Jennifer", 44),
    User("Dennis", 23))

  val twentySomethings =
    for (user <- userBase if user.age >= 20 && user.age < 30)
      yield user.age


  twentySomethings.foreach(println)


  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- 0 until n if i + j == v)
    yield (i, j)

  foo(5, 5) foreach {
    case (i, j) =>
      println(s"($i, $j) ")
  }


}
