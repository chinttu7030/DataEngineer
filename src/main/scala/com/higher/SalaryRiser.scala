package com.higher

object SalaryRiser extends App {
  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)





  //  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
  //    salaries.map(promotionFunction)
  //
  //  def smallPromotion(salaries: List[Double]): List[Double] =
  //    promotion(salaries, salary => salary * 1.1)
  //
  //  def greatPromotion(salaries: List[Double]): List[Double] =
  //    promotion(salaries, salary => salary * math.log(salary))
  //
  //  def hugePromotion(salaries: List[Double]): List[Double] =
  //    promotion(salaries, salary => salary * salary)

}
