public class class_and_object {

    //This is all about create class


//     public static void main(String[] args) {
//     Animal h; // declare
//     h = new Animal();  // define
//     h.display(); //instance variable

//     }
// }
//    class Animal{
//     void display(){
//         System.out.println("Horse is eating");
//     }



/*
 


 */


  public static void main(String[] args) {
    Abc cal = new Abc();
    cal.abc(4, 5);
    System.out.println();

  }
}

class Abc{
      int abc(int a, int b){ //parameterizes 
           return a+b;
  }
  int abc (int a, int b, int c){  // when same name constructor but different parameter is called **constructor overloading**
    return a+b+c;
  }

  void nonparameterized(){
       System.out.println("this is non parameterizes constructor");
  
}
    }


    /*
      
    Static keyword in java


     */
    