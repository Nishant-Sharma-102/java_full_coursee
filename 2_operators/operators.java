package operators;

/*
   +*-% Arithmatic operators
   >< >= <= == != Relational //for comparision
   ++ -- incr decr// type casted operator
   && || ! Logical
   & | Boolean logical
  
  ?: conditional operator
  
    */
public class operator {
  public static void main(String[] args) {
    // byte a = 20;
    //     a++;

    int a = 50, b=20;
   String S;
   S= a>b?"hello":"Bye";
   System.out.println(S);
    
    // System.out.println(++a>20 && ++b>2); // false is also called short circuit operator;  true evaluted
    // System.out.println(a);  //11
    // System.out.println(b); //5 
    // System.out.println(++a>20 || ++b>2); //true      // false evauated
    // System.out.println(a); //51
    // System.out.println(b); //20
    // System.out.println(50>10);
    // System.out.println(50==50);
    // System.out.println(40!=40);
  }

}
