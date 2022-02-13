package com.Udemy

object demo7 extends App {

  val s = Set(1, 2, 3, 4, 5)
  val s1 = s + 4
  println(s1)

  // To get the mutable set needs to declare at the beginning and make that set as mutable

  val m = Map(("Texas" -> "Austrin", "colour" -> "Red"))
  1 -> 2 -> 3

  // For using the map need to set as mutable if wants to change the values
  // By default both the values of set and map are immutable


  var i = 0
  while (i < 5) {
    println(i)
    i += 1
  }

  for (i <- 0 until 5) {
    println(i)
  }
  //In scala need to mention until in place of to

  val q = Array.fill(5)(math.random)
  for (x <- q) println(q)


  // Normally for loops in scala for loops does not return anything so need to use the YIELD function to return
  for (x <- s) yield x * x
  s.map(x => x * x)


  for (i <- 0 until 5;
       if i % 2 == 0; a = 2 * i;
       j <- 5 until 10) yield (a, j)

  //we can use the {} to avoid the semicolon after the each expression


}
