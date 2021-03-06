package controlabstactions

import java.io.{File, PrintWriter}
import java.time.LocalDateTime

object ControlStructure extends App {

  //region Function as an argument
  def twice(function: Double => Double, value: Double) = function(function(value))
  
  val result = twice(_ + 1, 5)
  println(result)
  //endregion


  //region Control abstraction with currying and curly braces
  def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
  
  val file = new File("file.txt")
  withPrintWriter(file) {
    writer => writer.println(LocalDateTime.now)
  }
  //endregion

  
  //region By name parameter
  val assertionFlag = true
  def assert(predicate: => Boolean) = {
    if (assertionFlag && !predicate) {
      throw new AssertionError
    }
  }
  
  assert(5 > 3)
  
  val list = List("3")
  assert(list.nonEmpty)
  //endregion
}
