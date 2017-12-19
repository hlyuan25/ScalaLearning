package lesson6

import scala.collection.mutable.ArrayBuffer

class Network { outer =>
  class Member(val name: String){
    val contacts = new ArrayBuffer[Network#Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m

  }
}

object Network{




  def main(args: Array[String]): Unit = {
    val chatter = new Network
    val myFace = new Network

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")

    fred.contacts += wilma
    val barney = myFace.join("Barney")
    fred.contacts += barney
  }
}
