package edu.vikalp2

object App8FunDefaultValue {

  def add(x:Int=20,y:Int=30):Int={
    x+y;
  }

  def +(x:Int, y:Int): Int = {
    x + y;
  }

  def print(x:Int,y:Int):Unit={
    println(x+y);
  }

  object Maths{
    def *(x: Int, y: Int): Int = {
      x * y;
    }
  }

  def main(args:Array[String]): Unit = {
    println(add());
    println(App8FunDefaultValue.+(5,5));
    println(add(10));
    println(add(10,20));
    println(print(50,50));
    println(App8FunDefaultValue.+(5,5));
    println(Maths.*(5,5));
    var result= (x:Int, y:Int) =>x+y;




  }

}
