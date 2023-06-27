//package homeworks.mihail_chursinov.hw_06_23.hw_23_06_23.task1;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.sql.SQLDataException;
//import java.util.Date;
//
//public class Catch extends Exception {
//
//    public final void foo() {     //no input arguments
//        System.out.println("Foo");
//    }
//
//
//    @Override
//    public Object getNumberOfCars() { //public void getNumberOfCars()
//        int year = getYear();//call the method from super class. Method getYear() - private
//        return new Object;
//    }
//
//    @Override
//    public static Date getTime() { //static method
//        return new Date();
//    }
//
//    protected Integer getPatientFromDatabase(File file, Integer number) throws SQLDataException {
//        System.out.println("Integer");
//        count = 1;     //int count = getCount();
//                       // count = 1;
//        return count; // return getCount();
//    }
//
//    private int getPatientFromDatabase(File file, int number) throws Exception { //class Exception does not follow
//        // Throwable
//        System.out.println("int");
//        return 6;
//    }
//
//    public int getPatientFromDatabase(File file, int number, int years) throws Exception { //class Exception does not follow
//        // Throwable
//        return 2;
//    }
//
//    public File getFileName(Path path) throws IOException, SQLDataException { //no exceptions in method
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
//        System.out.println(aCatch.getPatientFromDatabase(new File(""), 2)); // getPatientFromDatabase -
//        // private
//    }
//
//}
