package lessons.ls_10_23.ls_17_10_23;

/**
 * http://netjs.blogspot.com/2015/06/synchronization-in-java-multithreading-synchronizing-thread.html
 */

// This class' shared object will be accessed by threads
public class Message {
    /*   public void displayMsg(String msg) {
           synchronized (this) {
               System.out.println("Inside displayMsg method " + Thread.currentThread().getName());
               System.out.println("**" + msg);

               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("* " + Thread.currentThread().getName());
           }
       }*/
//static method
    public static void displayMsg(String msg) {
        synchronized (Message.class) {
            System.out.println("Inside displayMsg method " + Thread.currentThread().getName());
            System.out.println("**" + msg);
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("*");
        }
    }

}

class MyClass implements Runnable {
    private Thread t;
    private Message msg;
    private String message;

    MyClass(Message msg, String str) {
        this.msg = msg;
        this.message = str;
        // creating threads, 4 threads will be created
        // all sharing the same object msg
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        msg.displayMsg(message);
    }
}

class SynchronizedDemo {
    public static void main(String[] args) {
        Message msg = new Message();
        MyClass mc1 = new MyClass(msg, "I");
        MyClass mc2 = new MyClass(msg, "am");
        MyClass mc3 = new MyClass(msg, "not");
        MyClass mc4 = new MyClass(msg, "synchronized");
    }
}