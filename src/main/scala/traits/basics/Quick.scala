package traits.basics

trait Quick {
  val speed: Double

  def timeForDistance(distance: Double): Double = {
    distance/speed
  }

  override def toString: String = "vzhhhh..."
}
