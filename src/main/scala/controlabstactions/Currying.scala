package controlabstactions

object Currying extends App {

  def stepByStepSum(x: Int) = (y: Int) => x + y

  val stepOne: Int => Int = stepByStepSum(3)
  val result: Int = stepOne(5)
  println(result)
  
  def plainSum(x: Int)(y: Int) = x + y

  val sum: Int = plainSum(4)(11)
  println(sum)
}
