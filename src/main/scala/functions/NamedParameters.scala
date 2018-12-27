package functions

object NamedParameters extends App {
  def speed(distance: Double, time: Double) = distance / time

  val resultSpeed = speed(time = 10, distance = 56)
  println(resultSpeed)
}
