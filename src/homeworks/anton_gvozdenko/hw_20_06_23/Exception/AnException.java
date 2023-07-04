package homeworks.anton_gvozdenko.hw_20_06_23.Exception;


public class AnException {
    public static void gradeCheck(int grade) throws SyntaxStudentException {

        if (grade > 90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        } else if (grade < 90) {
            System.out.println("You are a great student");

        }
    }

    public static void main(String[] args) throws SyntaxStudentException {
        gradeCheck(95);
    }

}
