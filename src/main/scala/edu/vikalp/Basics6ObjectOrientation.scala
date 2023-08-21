package edu.vikalp

object Basics6ObjectOrientation extends  App{

  abstract  class Animal{
    val hasLegs:Boolean=true;
    def walk():Unit;
  }

  class Dog extends Animal{
    override def walk(): Unit = {
      println("walking by 4 legs");
    }
  }

  val animal:Animal=new Dog ();
  println(animal.hasLegs);
  animal.walk();

  val dog:Dog=new Dog();
  println(dog.hasLegs);
  dog.walk();


}
