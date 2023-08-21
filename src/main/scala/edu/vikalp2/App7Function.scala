package edu.vikalp2


object App7Function {


  def add(x:Int, y:Int): Int = {
    return x+y;
  }

  def minus(x: Int, y: Int): Int = {
     x - y;
  }

  def multiply(x: Int, y: Int): Int =return x * y;

  def divide(x: Int, y: Int) = x / y;

  object Math{

    def square(x:Int):Int={
      x*x
    }

    def cube(x:Int)=x*x*x;
  }

  def main(args: Array[String]): Unit = {
    var result1: Int = add(20, 10);
    println(result1);

    var result2: Int = minus(20, 10);
    println(result2);

    var result3: Int = multiply(20, 10);
    println(result3);

    var result4 = divide(20, 10);
    println(result4);

    var result5 = Math.square(5);
    println(result5);

    var result6 = Math cube 5;
    println(result6);
  }


}
