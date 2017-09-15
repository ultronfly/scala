//Ques :- Print the string in reverse order without using reverse method

object stringreverse {
  def main(args: Array[String]): Unit = {
    var name = "SCALA"
    var len = name.length
    for(i <- len-1 to 0 by -1){
      print(name(i))
      }
  }
}
