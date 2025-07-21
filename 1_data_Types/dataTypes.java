
package data_Types;

// we show the nature of data is called datatypes
//byte 127 to -128, short 2power15-1 to   2power-15 , int 4byte  , long  8byte, double 8byte, boolean, float 4byte, char 2 byte 16 bit 2to power16
//java support unicode character
// java has no implicit type conversion
//it have explicit type conversion
//Boolean is isolated data type becouse of comparision not allowed in boolean datatypes


public class dataTypes {

    public static void isolated(int a, int b ,int c){
       a=10;
       b=10;
       c=10;
        Boolean x ;
       x = (a==b==c);//to give error 

    }
    public static void main(String[] args) {
      //byte a = 130;
       int a = (byte)130;

       int  b = 130;
       long l = b;
       
       long c = 130;
       int d;
          d = (int)130;


          float f = 13.0f;  //automatic or bydefault value is double so we make a float value to put f 

        
          System.out.println(f);
          System.out.println(d);
       System.out.println(l);
      System.out.println(a);
    }

}
