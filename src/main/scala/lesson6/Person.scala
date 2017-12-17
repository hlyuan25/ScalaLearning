package lesson6

class Person (val name: String){
  var age = 0
  def description = s"$name is $age years old."

}

object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person("Ian")
  }
}
