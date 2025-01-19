object hollowSphere extends App {
  println("Please enter outer sphere radius (in cm):")
  val outerRadius:Double = Input.readDouble()

  println("Please enter surface thickness (in cm):")
  val thickness = Input.readDouble()

  println("Enter material density (in g/cm3):")
  val density = Input.readDouble()

  val outerVolume = (4.0 / 3.0) * 3.14159 * outerRadius * outerRadius * outerRadius
  val innerRadius = outerRadius - thickness
  val innerVolume = (4.0 / 3.0) * 3.14159 * innerRadius * innerRadius * innerRadius

  val surfaceVolume = outerVolume - innerVolume
  val mass = surfaceVolume * density

  val densityRatio = mass /outerVolume

  println(f"Total outer sphere volume: $outerVolume%.10f cm3")
  println(f"Density ratio: $densityRatio%.10f")

  if (densityRatio < 1){
    println("=> The object is flaoting")
  } else {
    println("=> The object is sinking")
  }
}
