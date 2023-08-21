package edu.vikalp

object Basics7Trait extends App {

  //interface = fully abstract type
  trait animalTrait{
    val nose:Int;
    def eat():Unit;

  }

  class Lion extends animalTrait{

    override val nose: Int = 2;
    override def eat(): Unit = println("eating grass")
  }

  val lion:Lion=new Lion();
  println(lion.nose);
  lion.eat();

  val animal: animalTrait = new Lion();
  println(animal.nose);
  animal.eat();

}
