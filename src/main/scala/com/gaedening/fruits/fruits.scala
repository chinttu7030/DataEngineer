package com.gaedening

import com.Generic.Fruit
import com.gardening.fruits.{Apple, Banana, Plum}

package object fruits {
  val planted = List(Apple, Plum, Banana)

  def showFruit(fruit: Fruit): Unit = {
    println(s"${fruits.name}s are ${fruits.colour}")
  }

}
