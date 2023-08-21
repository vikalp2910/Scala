package edu.vikalp

import scala.util.{Failure, Success}

object Basics12Exceptions extends App {

  def f1(){

    try{
       val x:String=null;
       println("inside f1()");
       x.length();
  }
  catch {
    case e :Exception=>"some exception occurs";
  }
  finally {
    println("finally block");
  }

  }

  f1();

  def f2()= {
   var data:String="test";
    println(data);
  }

  f2();

  def f3():String= throw new RuntimeException();

}
