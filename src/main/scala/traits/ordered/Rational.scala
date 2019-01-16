package traits.ordered

class Rational(n: Int, d: Int) extends Ordered[Rational] {
  val numerator: Int = n
  val denominator: Int = n

  override def compare(that: Rational): Int = {
    (this.numerator * that.denominator) - (that.numerator * this.denominator)
  }
}
