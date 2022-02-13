package com.LearningJournal

object dem extends App {

  // First class function is a function as a value


  val d = (i: Int) => {
    i * 2
  }
  println(d(2))


  def getOps(c: Int) = (i: Int) => {
    val doubler = (x: Int) => {
      x * 2
    }
    val tripler = (x: Int) => {
      x * 3
    }
    if (c > 0) doubler(i)
    else tripler(i)

  }

  println(getOps(4))

  for (i <- 0 to customers.length - 1)
    println("hi + customers(i)")


  def remindpayment(x: String) = println("payment remainder for" + x)
  //   remindpayment:(x:String)Unit


  def foreach(a: Array[String], f: String => Unit) = {
    var i = 0
    for (i <- 0 to a.length - 1) {
      f(a(i))
      //remindpayment(customers(i))
    }
  }

  val customers = Array("dev", "suri", "Reddy")

  foreach(customers, remindpayment)


}
