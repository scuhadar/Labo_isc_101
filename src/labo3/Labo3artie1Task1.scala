object Labo3artie1Task1 extends App {
  /**
   * Starting point of the program
   */
  var x = 0
  var y = 0

  // Integer used to choose the operator type
  var operatorType = 0

  // Display the kind of operations that we can handle
  println("Choose now the operator, by entering a number between 1 and 4:\n" + "1 - Addition\n" + "2 - Subtraction\n" + "3 - Multiplication\n" + "4 - Division\n")

  // Read the operator from the console
  print("Enter your choice : ")
  operatorType = Input.readInt()

  // Display the message
  println("Take care to enter only integer numbers !")
  print("Enter first integer: ")

  // Read the two numbers from the console
  x = Input.readInt()
  print("Enter the second integer: ")
  y = Input.readInt()

  // Decision tree that should be replaced by a match
  operatorType match {

  case 1 =>  println("Result of the addition is: " + (x + y))
  case 2 =>  println("Result of the subtraction is: " + (x - y))
  case 3 =>  println("Result of the multiplication is: " + (x * y))
  case 4 =>  println("Result of the division is " + (x / y))
  case _ =>  System.err.println("You did not enter a correct number for the operation.")
  }
}
