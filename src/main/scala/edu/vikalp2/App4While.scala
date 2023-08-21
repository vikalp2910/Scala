package edu.vikalp2

object App4While {

  def main(args:Array[String]): Unit = {

    var x: Int = 1;


  while (x<=10){
    println(s"x is ${x}");
    x=x+1;
   }

    var y:Int=1;
    do {
      println(s"y == ${y}")
      y+=1;
    }while(y<=10)
  }
}
