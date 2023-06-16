//package homeworks.mihail_chursinov.hw_19_05_23.task2;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.nio.file.Path;
//import java.util.Date;
//
//public class Exception {
//
//    private int getYear() {
//        return new Date().getYear(); //???
//    }
//
//    public final void foo() {
//        System.out.println("Foo");  //С начала идут поля, конструкторы, гет/сет, а потом методы!
//    }
//
//    private int count;
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public void getNumberOfCars() {
//        System.out.println(5);
//    }
//
//    public Object getFileName(Path path) throws FileNotFoundException {  //throws указует на исключение ошибки
//                                                                         // FileNotFoundException, при этом должно
//                                                                         //прописыватся try/catch.
//        File file = new File("./Text.txt");
//        return file;
//    }
//
//    public static Date getTime() {
//        return new Date();
//    }
//
//    protected String calculate(String first, int count) { //Метод должен возвращать сумму! В аргументе у нас строка
//                                                          // String first!
//        return "2*2=4";
//    }
//}
