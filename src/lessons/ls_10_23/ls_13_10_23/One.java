package lessons.ls_10_23.ls_13_10_23;

import java.io.IOException;

public class One {
    public static void main(String[] args) {
//        throw new NullPointerException();

//        new Thread()

        MyThread myThread = new MyThread();

//        myThread.start();

        MyRunnable myRunnable = new MyRunnable();

        Runnable runnable = () -> {
            System.out.println("Hello");
            while (true) {

            }
        };

        Thread thread = new Thread(runnable, "Worker");

        thread.setDaemon(true);

        thread.start();

        System.out.println("End of main");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Another thread");
        throw new NullPointerException();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside MyRunnable");
//        print();
        try {
            throw new IOException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void print() throws IOException {
        throw new IOException();
    }
}

class Time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {

            }
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);
    }
}



