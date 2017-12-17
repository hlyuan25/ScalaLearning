package lesson5

class Counter {
  private var value = 1 //You must initialize the field, to test private[ClassName]
  def increment(){ value += 1}  // Methods are public by default
  private def current() = value
  def isLess(other : Counter) = {

   // this.value < 2
    value < other.value
  }

  class Pri{
    private val p = 1
    val t = new Counter
    private def tt = 1

    def isLess(other : Counter) = p < other.value
  }
}

object Counter{
  def main(args: Array[String]): Unit = {
    val t = new Counter
    println(t.value)

  }
}
