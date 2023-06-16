package lessons.ls_16_06_23;

import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLDataException;

public class LearnExceptions {
    public static void main(String[] args) throws IOException {
//        System.out.println(5 / 0);

//        throw new NullPointerException();

        print2();
    }

    public static void print1() {
        try {
//            throw new IOException("I'm IO exception");
            Files.write(null, "".getBytes());
        } catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void print6() {
        try {
            if (1 == 1) {
                throw new IOException();
            } else {
                throw new SQLDataException();
            }

        } catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (SQLDataException e) {

        }
    }

    public static void print3() {
        try {
            //complex logic
            Files.write(null, "".getBytes());
            //complex logic

        } catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void print2() throws IOException {
        throw new IOException("I'm IO exception");
    }
}
