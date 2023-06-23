package homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task2;

/**
 * Create a custom Exception class
 *    In main class create a method that will check students grade
 *    if students grade is > 90 then exception should be thrown
 *    if students grade is below 90 print "You are a great student"
 *    In main method calls method gradeCheck and handle an Exception
 *    **Expected Output:**
 *    ```
 *    SyntaxStudentException: You are an exceptionally awesome student
 *    ```
 */

public class MyExceptionClass extends Exception{
    public MyExceptionClass(String message) {
        super(message);
    }
}
