package functions

object DefaultParameterNames extends App {
  def greeting(hello: String = "Hello", name: String = "World") = s"$hello, $name"

  val withFirstUnnamedParameter = greeting("Hi")
  val withSecondNamedParameter = greeting(name = "Denys")

  println(withFirstUnnamedParameter)
  println(withSecondNamedParameter)
}
