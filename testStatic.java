public class testStatic {
    public static void main(String[] args) {
     Abc a1 = new Abc();
     Abc a2 = new Abc();
     Abc a3 = new Abc();
     Abc a4 = new Abc();
     Abc.display();
    }
    }
class Abc{
    static int count = 0;
    Abc(){
        count++;
    }

  static  void display(){
        System.out.println(count);
    }

}

