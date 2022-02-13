package com.Udemy

object demo3 extends App {


  val phonepattern = """\((\d\d\d\) (\d\d\d)-(\d\d\d\d))|""".r
  val phonebook =
    """Name1   (210) 555-3758
      |Name2 (512) 555-6489
      |Name3 (608) 876-9876
      |""".stripMargin
  //Regular Expression
  for (m <- phonepattern.findAllMatchIn(phonebook)) {
    val areacode = m.group(1)
    println(areacode)

  }
  //This is how we create regular expressions in scala by using the regex and we can match all the case


  //Regular Expressions as Patterns


  val linepatterns = """(\w+), (\w+)\s+(\(\d\d\) \d\d\d-\d\d\d\d)""".r
  val source =
    """Name1 devender reddy 010-1234|
      |Name2 chappidi reddy 202-3695
      |Name3 surendra kudumula 303-745
      |""".stripMargin
  // we can import the file from the other sources and that format we want then the values
  // in those three will be sorted in the variables
  // if condition for fails then the comes out of the loop and returns nothing
  for (linepatterns(last, first, number) <- source) {

  }
  println(source)


}
