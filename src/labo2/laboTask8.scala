package labo2

object laboTask8 extends App {
  println("write your second! Please")
  val seconds :Int = Input.readInt()
  var hour:Int = (seconds /3600).toInt
  var minutes:Int = (seconds - (hour * 3600).toInt ) / 60
  var rest: Int = (seconds - (hour * 3600) - (minutes *60) )
  println(s"$hour : $minutes : $rest " )
}
