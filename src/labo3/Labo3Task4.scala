package labo3
import hevs.graphics.FunGraphics
import java.awt.Color
object Labo4Task4 extends App {
val fg =new FunGraphics(400,400,"Rectangle")

  for (i<- 51 until 351){
    for(j<- 101 until 301){
      fg.setPixel(i,j,Color.blue)
    }
  }
}
