package traits.mixing

trait Doubling extends IntQueue {
  abstract override def put(x: Int): Unit = super.put(2 * x)
}
