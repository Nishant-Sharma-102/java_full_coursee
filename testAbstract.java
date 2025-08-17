public class testAbstract {

   /*
    * has a class relationship ans has a class realtionsihp not possible in
    * abstract class
    * we can't define abstract calss only declare
    * interface is the replacement of abstract class
    * 
    * loosely coupled application make abstraact class
    * 
    * when we write interface starting in class is make default abstract method is
    * called interface
    * we are using implement to inherite class
    */
   public static void main(String[] args) {
      Area a1 = new Rect();
      a1.area();
   }
}

abstract class Area {
   abstract void area();

}

class Circule extends Area {
   void area() {
      double r = 12.44, A, PI = 3.14;
      A = PI * r * r;
      System.out.println("area of circule   " + A);
   }
}

class Rect extends Area {
   void area() {
      double l = 10.4;
      double w = 20, A;
      A = w * l;
      System.out.println("area of rectangle  " + A);

   }
}
