//package homeworks.mihail_chursinov.hw_19_05_23.task2;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.sql.SQLDataException;
//import java.util.Date;
//
//public class Catch extends java.lang.Exception {
//
//    public final void foo() {            //Перегружать метод final нельзя!
//        System.out.println("Foo");
//    }
//
//
//    @Override
//    public Object getNumberOfCars() {
//        int year = getYear();//call the method from super class
//        return new Object;
//    }
//
//    @Override
//    public static Date getTime() { //ничем не отличается от метода в родителе
//        return new Date();
//    }
//
//    protected Integer getPatientFromDatabase(File file, Integer number) throws SQLDataException { //???
//        System.out.println("Integer");
//        count = 1;
//        return count;
//    }
//
//    private int getPatientFromDatabase(File file, int number) throws java.lang.Exception { /????
//        System.out.println("int");
//        return 6;
//    }
//
//    public int getPatientFromDatabase(File file, int number, int years ) throws java.lang.Exception {
//        return 2;
//    }
//
//    public File getFileName(Path path) throws IOException, SQLDataException{
//        return new File("./MyFile.txt");
//    }
//
//
//    Object calculate(String name, Integer count, BufferedReader bufferedReader) {
//        return new Object();
//    }
//
//    public static void main(String[] args) {
//        Catch aCatch = new Catch();
//        System.out.println(aCatch.getPatientFromDatabase(new File(""), 2));
//    }
//
//}
