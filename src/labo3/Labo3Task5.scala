package labo3

import hevs.graphics.FunGraphics

import java.awt.Color

object Labo3Task5 extends App {
  var fg = new FunGraphics(256,256,"Rainbow")
  for(i<- 0 until 256){
    for(j<- 0 until(256)){
      fg.setPixel(i,j,new Color(i,0,j))
    }
  }
}
