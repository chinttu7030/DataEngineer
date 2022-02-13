package com.Udemy

object demo6 extends App {

  //PATTERN MATCHING AND CASE CLASSES
  val strs = "welcome to scala worksheet".split("")
  val lst = List(1, 2, 3, 4, 5, 6)
  val Array(hour, minute, seconds) = "5:36:43".split(":")


  val num = List(1, 2, 3)
  val red = 1 :: 2 :: 3 :: Nil
  //we can create list by using KHANDAAN(::) by ending up with the NIL
  //KHANDAAN used in the pattern match

  def listlength(lst: List[Int]): Int
  = lst match {
    case Nil => 0
    case h :: t => 1 + listlength(t)
  }

  listlength(lst)
  lst.find(_ > 2) match {
    case None => "NOT Found"
    case Some(i) => "Found" + i
  }
  val people = Array(Person("mark", 40), Person("Amber", 60))
  val Person(n, a) = people(0)


}
