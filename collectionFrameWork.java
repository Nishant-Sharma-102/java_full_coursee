import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class collectionFrameWork {
    public static void main(String[] args) {
         //ARAYLIST
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(12);
    list.add(23);
    list.add(2,25);
    list.add(32);
    
    // System.out.println(list);

    //LINKED LIST
    LinkedList<Integer> listt = new LinkedList<Integer>();
    listt.add(2);
    listt.add(3);
    //System.out.println(listt);

    Vector<String> vector = new Vector<String>(); 
    vector.add("vikku");
    vector.add("nish");
    vector.add("dish");
   // System.out.println(vector);


    // STACK
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(2);
    stack.push(3);
    stack.push(4);
    //System.out.println(stack);
    stack.pop();
   //System.out.println( stack.peek());

   //SET
   //TEKE UNIQUE VALUE, INORDER TO SAVE DATA
   Set<Integer> set = new HashSet<Integer>(); 
   set.add(30);
   set.add(1);
   set.add(2);
   set.add(3);
   set.add(3);
   //System.out.println(set);

   //LinkedHashSet
 //ORDER IN VALUE , take always unique value
   LinkedHashSet<Integer> llSet = new LinkedHashSet<Integer>();
   llSet.add(10);
   llSet.add(12);
   llSet.add(12);
   llSet.add(19);
   llSet.add(3);
  // System.out.println(llSet);
    
   //TRESET
   //sorted data , dont take same data gieve unique data same as set interface
   TreeSet<Integer> tset = new TreeSet<Integer>();
   tset.add(20);
   tset.add(10);
   tset.add(30);
   tset.add(40);
   tset.add(20);
  // System.out.println(tset);

 //  QUEUE
 Queue<Integer> queue = new LinkedList<Integer>(); 
 queue.add(2);
 queue.add(1);
 queue.add(133);
 queue.add(14);
 System.out.println(queue.poll());
 //System.out.println(queue);
 //System.out.println(queue.peek());

 //Map 

 HashMap<String,Integer> map  = new HashMap<String, Integer>();
 map.put("first", 5);
 map.put("secound", 4);
 map.put("third ", 6);
 System.out.println(map);

    }
}
