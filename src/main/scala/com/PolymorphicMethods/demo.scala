package com.PolymorphicMethods

object demo extends App {


  def listofDuplicates[A](x: A, length: Int): List[A]
  = {
    if (length < 1)
      Nil
    else
      x :: listofDuplicates(x, length - 1)
  }

  println(listofDuplicates[Int](3, 4))
  println(listofDuplicates("La", 8))


}
