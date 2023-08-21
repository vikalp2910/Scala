package edu.vikalp

object Basics5ObjectOrientation extends App{

  class Animal{

    val eyes:Int=2;
    val legs:Int=4;

    def sound()=println("Animal sound");
  }

  class Dog(val teeth:Int) extends Animal{

    override def sound()=println("dog bark sound");

  }

  val animal: Animal = new Animal();
  println(animal.eyes);
  println(animal.legs);
  animal.sound();

  val dog: Dog = new Dog(32);
  println(dog.eyes); println(dog.legs); println(dog.teeth);
  println(dog.sound());

  val animal2:Animal=new Dog(31);
  println(animal2.eyes);
  println(animal2.legs);
  animal2.sound();

  //val dog2:Dog=new Animal();   error


}
