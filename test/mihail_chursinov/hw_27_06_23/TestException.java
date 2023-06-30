package mihail_chursinov.hw_27_06_23;

import homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task2.Main;
import homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task2.SyntaxStudentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestException {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test(expected = SyntaxStudentException.class)
    public void shouldCheckGrade() throws SyntaxStudentException {
        Main main = new Main();
        main.checkGrade(95);
    }
    @Test
    public void shouldCheckGradeUsingRule() throws SyntaxStudentException {
        Main main = new Main();

        expectedException.expect(SyntaxStudentException.class);
        expectedException.expectMessage("You are an exceptionally awesome student!");
        main.checkGrade(95);


    }
}
