object RoomCalc extends App {
// this file upload isc learn
  /**
   * For each dimension, display a message, gets the value from the user
   * and store the value in the corresponding variable
   */
  println("Volume calculator, By Soner Cuhadar")

  print("Enter width (m) : ")
  val width: Double = Input.readDouble()

  print("Enter length (m) : ")
  val length: Double = Input.readDouble()

  print("Enter height (m) : ")
  val height: Double = Input.readDouble()

  // Perform the computation
  val vol: Double = width * length * height
  val gol: Double = vol / 0.00454609

  // Compute the volume and displays it
  println(s"The corresponding volume is $gol gallon (UK)")
  println(s"Goodbye and thank you")
}