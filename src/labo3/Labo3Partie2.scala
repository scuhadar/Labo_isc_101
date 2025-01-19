import hevs.graphics.FunGraphics

import java.awt.Color


object Labo3Partie2 extends App {
  val fg:FunGraphics =new FunGraphics(300,200,"Design a arrow")

  for(i<- 100 to 200){ //line
    fg.setPixel(i,100)

  }

  for(j <- 80 to 100){ //haute
    fg.setPixel(j +100,j)
  }
  for (g<- 0  to 20 ){ //basse
    fg.setPixel(g + 180,120- g)
  }


}
