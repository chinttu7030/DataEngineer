package com.Udemy

object demo5 extends App { //HIGHER ORDER METHODS AND LAMDAS

  val a = Array(1, 2, 3, 4, 5)
  val b = List(6, 7, 8, 9, 5)
  val c = Vector.tabulate(10)(i => i * i)

  a.foreach(println)
  a.map(i => 1 * 2)
  println(a)
  a.map(_ * 2) //we can use the '_' to simplify the code instead of function with rocket symbol
  println(a)
  b.filter(_ < 5)
  println(b)

  a.flatMap(i => b.take(i))
  println(a)
  c.exists(_ > 50)
  println(c)
  c.forall(_ < 50)
  println(c)
  a.reduceLeft((x, y) => x + y)
  println(a)
  a.reduceRight(_ + _)
  println(a)
  a.foldLeft("0")(_ + _)
  println(a)



  // Option is two types sum and none
  //If we does not satisfy the condition then returns to the default value

  b.find(_ % 7 == 0).map(_ / 3).getOrElse(0)
  println(b)

  //Work on having options instead of having nulls.TYPE system cannot help you


}
