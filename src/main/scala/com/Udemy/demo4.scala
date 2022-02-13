package com.Udemy

object demo4 extends App {


  val arr = Array(1, 2, 3)

  val lst = List("true", 3, 65, 5.0) //Single Linked list are immutable
  println(lst)
  println(arr)


  println(arr(0))

  def f(i: Int) = 42 * i

  f(5)

  println(lst(4))
  println(arr(0) = 99)
  1 :: lst //By using "::" we need to add the element into list because if we try to add normal
  println(lst) //like array it take lost of time so this is better way to add into list

  val arr2 = Array.fill(1000)(0)
  println(arr2)
  val arr3 = Array.fill(100)(math.random)
  println(arr3)
  //Fill and Tabulea are the methods for the large array and list values

  //To get the first element and last element there is function called HEAD & LAST
  //TAIL gives all expect head DROP to remove REVERSE


  def littleArray(i: Int): Array[Int] = Array(i, i, i)

  littleArray(util.Random.nextInt(10))
  println(littleArray(1))

  val arr4 = Array.tabulate(10)(i => i * i)
  println(arr4)

  //Vector is a indexable sequence that happens to be mutable
  //Buffer is highly mutable two types list buffer and list buffer
  // Buffer is in scala.collection.mutable.Buffer
  //Range 1 to 10 by 2


}
