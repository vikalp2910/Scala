package edu.vikalp

object Basics9Trait extends App {

  trait Car{
    def wheel():Unit;
  }

  class Kia extends Car{
    override def wheel(): Unit = println("wheel count 4");
  }

  val vehicle1:Kia=new Kia();
  vehicle1.wheel();

  val vehicle2=new Car {
    override def wheel(): Unit = println("wheel direct count 4");
  }
// Equivalent code
//  class Basics9Trait$$anon extends Car {
//    override def wheel(): Unit = println("wheel count 4");
//  }

  println(vehicle2);
  println(vehicle2.wheel());

}
