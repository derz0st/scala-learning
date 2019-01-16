package traits.mixing

object Runner {
  def main(args: Array[String]): Unit = {
    val basicIntQueue = new BasicIntQueue with Doubling with Filtering
    basicIntQueue.put(5)
    basicIntQueue.put(-7)
    basicIntQueue.put(2)

    println(basicIntQueue.get())
    println(basicIntQueue.get())
  }
}
