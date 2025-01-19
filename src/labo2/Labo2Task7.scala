package labo2

object Labo2Task7 extends App {
  def c2(a: String): String = {
    if (a.isEmpty) return a
    var word: String = ""
    //First character is big
    word += a.charAt(0).toUpper
    //middle is lower
    for (i <- 1 until a.length - 1) {
      word += a.charAt(i).toLower
    }
    //last is big
    if (a.length > 1) {
      word += a.charAt(a.length - 1).toUpper
    }
    word
  }
  val inputword: String = TextTools.readText()
  println(c2(inputword))
}

