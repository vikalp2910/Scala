package edu.vikalp2

object App11Closure {

  val add=(x:Int,y:Int)=>x+y;
  var number=10;
  val sum=(x:Int)=>x+number;

  def main(args:Array[String]): Unit = {
     println(add(10,20));
     number=100;
     println(sum(10));
    }
  }
