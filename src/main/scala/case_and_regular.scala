object case_and_regular {

  def main(args: Array[String]) {
    nameAndMailFromList
  }

  def nameAndMailFromList() : Unit = {
    val input = List[String]("Mr mr@mail.ru", "sdkfhjk7326uw", "ewfjh23")
    val input1 = List[String]("Mr", "mr@mail.ru", "sdkfhjk7326uw", "ewfjh23")

    val n = "([a-zA-Z]+) (\\w+@)(\\w+.\\w+)*".r
    val n1 = "([a-zA-Z]+)".r
    val n2 = "(\\w+@)(\\w+.\\w+)".r

    val result = input match {
      case List(n(a,b,b1),rest@_*) => a+" "+b1
      //case List(n1(a),n2(b,b1),rest@_*) => a+" "+b1
      case _ => "wrong"
    }
    val result1 = input1 match {
      //case List(n(a,b,b1),rest@_*) => a+" "+b1
      case List(n1(a),n2(b,b1),rest@_*) => a+" "+b1
      case _ => "wrong"
    }
    println(result)
    println(result1)
  }
}
