public class testThread {

    /*
     * in Thread -> main class is a already a Thred in java
     * example ->
     * public static void main(Stiring[] args) {
     * System.out.println(Thread.currentThread().getName());
     * Thread.currentThread().setName("MyThread");
     * System.out.println(Thread.currentThread().getName());
     
     Main is already a thread in java and execute firs 
     Thread life cycle ->>new born -> runnable state -> running -> Halt state -> dead state
     

     * }
     */
 
    public static void main(String[] args){ 
        MyThread m1 = new MyThread();
        // m1.start();
        System.out.println(m1.getName());
        m1.setName("ohlala");
        System.out.println(m1.getName());
        System.out.println("Start mainThread ");
      
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("start mythread class ");
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " ");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
