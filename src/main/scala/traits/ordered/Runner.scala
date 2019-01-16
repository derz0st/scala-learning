package traits.ordered

object Runner {
  def main(args: Array[String]): Unit = {
    val twoOfFive = new Rational(2, 5)
    val threeOfSeven = new Rational(3, 7)
    val threeOfSeven2 = new Rational(3, 7)

    println(twoOfFive >= threeOfSeven)
    println(threeOfSeven2 <= threeOfSeven)
  }
}
