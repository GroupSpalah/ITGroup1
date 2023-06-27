package homeworks.anton_gvozdenko.hw_20_06_23.exception;


public class Exception {
    public static void gradeCheck(int grade) throws SyntaxStudentException {
        try {
            if (grade > 90) {
                throw new SyntaxStudentException("You are an exceptionally awesome student");
            } else if (grade < 90) {
                System.out.println("You are a great student");
            }
        } catch (SyntaxStudentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SyntaxStudentException {
        gradeCheck(80);
    }

}
