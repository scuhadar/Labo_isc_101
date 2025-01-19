import labo2.TextTools

object test extends App{
  def c2 (a:String):String={
    var word :String =""
    for (i<- 0 until a.length){
      if(i==0 || i== a.length - 1){
        word +=a.charAt(i).toUpper
      }else{
        word +=a.charAt(i).toLower
      }
    }
    word
  }
  var soner:String="soner"
  println(c2(soner))
}
