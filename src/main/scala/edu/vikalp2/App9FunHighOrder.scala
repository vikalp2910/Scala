package edu.vikalp2

object App9FunHighOrder {

  def math(x:Double ,y:Double ,f:(Double,Double)=>Double):Double=f(x,y);

  def main(args:Array[String]): Unit = {

    var result=math(20.0,30.0,(x,y)=>x+y);
    println(result);
    var result2=math(20.0,30.0,(x,y)=>x.min(y));
    println(result2);
    var result3=math(20.0,30.0,(x,y)=>x max (y));
    println(result3);
  }
}
