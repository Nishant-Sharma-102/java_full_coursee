import java.util.*;


/*

 INTERVIEW QUESTION..
 
 Checked exception -> Compile time exception 
 Unchecked exception -> run time exception
 Throw -> user define exception
 Thows -> Compile time exception
 finally -> finally will execute when exception is apper or not 

 */
public class testException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ->>");
        String s = "NIshant";
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        try {
            System.out.println(s.charAt(30));
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
        c = a/b;
        System.out.println(c);
        }
        // catch(Exception e){
        // System.out.println("this is division error ");
        // }
        finally{
        System.out.println("this is finally block -> ");
        }
        c =a*b;
        System.out.println(c);
        c = a+b;
        System.out.println(c);
        c = a-b;
        System.out.println(c);

    }
}
