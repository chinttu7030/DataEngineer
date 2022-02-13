package com.Basics

import com.logs.Logger.info

object Demo extends App {


  val cg = new CustomizableGreeter("Scala", "developer")
  cg.Greet("Devender")
  info("Hello Logger")

}
