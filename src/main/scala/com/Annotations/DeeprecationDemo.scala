package com.Annotations

object DeeprecationDemo extends App {


  @deprecated("deprication message", "release # which deprecates method")
  def hello = "hola"


  hello


}
