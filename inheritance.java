public class inheritance {
 /*
 reusability
 inheritance increase class's richness
 same method name = different work is called overriding
 is a class relationship
 has a class relationship ans has a class realtionsihp not possible in abstract class
 is  a ralationsip compulsiory in abstract class
 we can't define abstract calss only declare
interface is the replacement of abstract class

 loosely coupled application make abstraact class 
 */
public static void main(String[] args) {
    // B b1 = new B();
    // b1.add(13, 13);
    // b1.subtract(29, 19);
    D d1 = new D();
    d1.priint(); // hello

}
}
// class A{
//     void add(int a, int b){
//     System.out.println(a+b);
//     }
// }
// class B extends A{
//     void subtract(int a,int b){
//         System.out.println(a-b);
//     }
    //use final keyword
    class C{
        int n = 100;
       void display(){
           // System.out.println(n);
        }
    }
    class D extends C{
        int n= 200;
        void priint(){
            System.out.println(n);
            System.out.println(super.n);
        }
    }


