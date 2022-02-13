package com.Traits

object Animal extends App {


  def speak(): String = "Wool"

  def StartTail(): Unit = println("Tail is Wagging")

  def StopTail(): Unit = println("Tail is Stopped")


  def StartRunning(): Unit = println("i am Running")

  def StopRunning(): Unit = println("Iam not running")


  println(speak)
  println(StartRunning)
  println(StopRunning)


}
