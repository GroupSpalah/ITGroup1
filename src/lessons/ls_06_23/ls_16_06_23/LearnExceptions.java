package lessons.ls_06_23.ls_16_06_23;

import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLDataException;

public class LearnExceptions {
    public static void main(String[] args) throws IOException {
//        System.out.println(5 / 0);

//        throw new NullPointerException();

        print9();
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

    public static void print7() {
        try {
            if (1 == 1) {
                throw new IOException();
            } else {
                throw new SQLDataException();
            }

        } catch (IOException | SQLDataException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void print8() {
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

        } catch (Exception e) {

        }
    }

    public static void print12() throws IOException, SQLDataException {
        if (1 == 1) {
            throw new IOException();
        }
        throw new SQLDataException();
    }

    public static void print13() throws Exception {
        if (1 == 1) {
            throw new IOException();
        }
        throw new SQLDataException();
    }

    public static void print14() throws Exception {
        throw new IOException();
//        throw new SQLDataException();
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

    public static void print10() {
        try {

            throw new NotCreatedPdfException("");

        } catch (NotCreatedPdfException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void print11() throws Exception {
        try {

            throw new IOException("");

        } catch (IOException e) {
            throw new Exception();
        }
    }

    public static void print9() {
        try {
            //open connection to database

//            System.exit(5);

            if (1 == 2) {
                throw new IOException();
            }
            //close connection to database

        } catch (IOException e) {
            System.out.println("Catch");
            //close connection to database
       /* } finally {
            System.out.println("Block finally");*/
            //close connection to database
        }

    }

    public static void print2() throws IOException {
        throw new IOException("I'm IO exception");
    }
}
