object CarRange extends App {
// this file changed RoomCalc

  println("Range Calculator, By Soner Cuhadar")


  print("Enter battery capacity (kWh) : ")
  val capacity : Double = Input.readDouble()

  print("Enery consumption(100km) : ")
  val consomation: Double = Input.readDouble()


  // Perform the computation
  val electric: Double = capacity / consomation * 100

  // Compute the fuel and print
  println(s"You can use it for a maximum of ${electric.toInt} kilometers.")
  println(s"Goodbye and thank you")
}