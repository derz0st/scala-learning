package traits.basics

object Runner {
  def main(args: Array[String]): Unit = {
    val philosophical: Philosophical = new Frog(15)
    println(philosophical.toString)

    philosophical.philosophize()

    val frog = new Frog(6)
    println(frog.timeForDistance(90))
  }
}
