package edu.vikalp2

object App12Currying {

  def add1(x:Int,y:Int):Int=x+y;


  def add2(x:Int)=(y:Int)=>x+y;

  def add3(x:Int)(y:Int)=x+y;

  def main(args:Array[String]): Unit ={
    println(add1(10,20));
    println(add2(20)(20));

    val sum2=add2(50);
    println(sum2(50));

    println(add3(10)(10));

    val sum3 = add3(50)_;
    println(sum3(50));
  }

}
