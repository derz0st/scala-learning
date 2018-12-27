package functions

object RepeatedParameters extends App {
  private val list = List("Words", "in", "the", "list")

  def printLineByLine(args: String*): Unit = {
    args.foreach(println)
  }

  printLineByLine("Hello", "Scala")
  printLineByLine(list: _*)
}
