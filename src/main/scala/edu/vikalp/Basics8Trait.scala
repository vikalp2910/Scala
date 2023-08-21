package edu.vikalp

import edu.vikalp.Basics6ObjectOrientation.Animal

object Basics8Trait extends App{

  class Parent{
   val p1=10;
   def pDef():Unit=println("pDef function");
  }

  class Child extends Parent{
    val c1=20;
    def cDef():Unit=println("cDef function");
  }

  trait myTrait1{
    def fun1();
    def ?!(child: Child):Unit;
  }

  trait myTrait2 {
    def fun2();
  }

  class Demo extends Child with myTrait1 with myTrait2 {

    override def fun1(): Unit = println(" fun1()");
    override def ?!(child: Child): Unit = println("dummy()");
    override def fun2(): Unit = println("fun2()");
  }

  val demo:Demo=new Demo();
  println("c1="+demo.c1);
  println("p1="+demo.p1);

  println(demo.cDef());
  println(demo.pDef());

  println(demo.fun1());
  println(demo.fun2());
  println(demo.?!(new Child()));

}
