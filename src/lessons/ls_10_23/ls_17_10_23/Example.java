package lessons.ls_10_23.ls_17_10_23;

public class Example {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello");
        };

        Thread thread = new Thread(runnable);

        thread.start();//new -> Runnable

        thread.setPriority(10);

//        thread.start();//
    }
}
