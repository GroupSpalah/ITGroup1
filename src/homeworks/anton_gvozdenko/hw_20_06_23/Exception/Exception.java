package lessons.homeworks.anton_gvozdenko.hw_20_06_23.Exception;

import java.io.IOException;

public class Exception {
    public static void gradeCheck(int grade) throws IOException {
        try {
            if (grade > 90) {
                throw new IOException();
            } else if (grade < 90) {
                System.out.println("You are great student");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        gradeCheck(50);

    }
}
