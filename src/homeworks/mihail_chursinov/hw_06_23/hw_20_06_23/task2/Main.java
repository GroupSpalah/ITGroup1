package homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task2;

/**
 * if students grade is > 90 then exception should be thrown
 * if students grade is below 90 print "You are a great student"
 */

public class Main {
    private int grade;

    public void checkGrade(int grade) {
        try {
            if (grade > 90) {
                throw new SyntaxStudentException("You are an exceptionally awesome student!");
            } else if (grade < 90) {
                System.out.println("You are a great student!");
            }
        } catch (SyntaxStudentException e) {
            System.out.println(e.getMessage());
        }
    }
}
