object Time extends App {
  // this file changed RoomCalc
  println("Time calculator, By Soner Cuhadar")

  print("Enter hour : ")
  val hours :Double= Input.readDouble()

  print("Enter minutes : ")
  val minutes:Double = Input.readDouble()

  val second :Double =(hours *3600) + (minutes * 60)

  println(s"This is the same as ${second.toInt}")
}
