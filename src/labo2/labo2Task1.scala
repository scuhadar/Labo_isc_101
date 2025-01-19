object labo2_Task1 extends App {
  println("Write first number. Please!")
  var a:Int = Input.readInt()

  println("Write second number. Please!")
  var b:Int = Input.readInt()

  println("Write third number. Please!")
  var c:Int = Input.readInt()

  if(a<b && a<c) {
    println(a)
  }else if((b<c && b<a)){
    println(b)
  }else{
    println(c)
  }
}
