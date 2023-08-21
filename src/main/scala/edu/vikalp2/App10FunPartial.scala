package edu.vikalp2

import java.util.Date

object App10FunPartial {

  def log(date: Date, message:String): Unit = {
    println(date+"   "+message);
  }

  def main(args:Array[String]): Unit = {

    val sum=(a:Int,b:Int,c:Int)=>a+b+c;
    println(sum(10,20,30));

    val fun1=sum(10,20,_:Int);
    println(fun1(30));

    var date=new Date();
    val fun2=log(date,_:String);
    println(fun2("test message1"));
    println(fun2("test message2"));
    println(fun2("test message3"));
    println(fun2("test message4"));

    val f2 = sum(10,_:Int, _: Int);
    println(f2(10,10));
  }
}
