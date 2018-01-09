package lesson10

class SecretAgent(codename: String) extends Person(codename){
  override val toString = "secret"+ name
}


