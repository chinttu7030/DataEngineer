package com.Basics

class CustomizableGreeter(prefix: String, postfix: String) extends Welcome {
  override def Greet(name: String): Unit = {
    println(prefix + name + postfix)
  }

}

