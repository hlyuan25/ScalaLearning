package lesson10

object Test2 {
  def main(args: Array[String]): Unit = {
    val alien = new Person("Fred") {
      def greeting = "Greetings, Earthling! My name is Fred."
    }
  }
  def meet(p: Person{def greeting: String}) {
    println(s"${p.name} says: ${p.greeting}")
  }
}
