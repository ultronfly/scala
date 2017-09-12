//Quest:- Take input string from user & convert it into opposite case. Ex:- I/P :- GunjRUCH Expected O/p:-gUNJruch


object IOProb1 {
  def main(args: Array[String]) {
    val a = scala.io.StdIn.readLine()
    //println(a)
    val b = a.length
    for(i <- 0 to b-1){
      if(a.charAt(i)>='a' && a.charAt(i) <= 'z'){
//        a.charAt(i) = a.charAt(i) - 32;
val z = a.charAt(i).toInt - 32;
        print(z.toChar)
      }
      else if(a.charAt(i)>='A' && a.charAt(i) <= 'Z'){
//               a.charAt(i) = a.charAt(i) + 32);
        val z = a.charAt(i).toInt + 32;
        print(z.toChar)
      }
    }
  }
}


