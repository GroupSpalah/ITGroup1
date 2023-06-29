package mihail_chursinov.hw_27_06_23;

import homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task2.Main;
import homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task2.SyntaxStudentException;
import org.junit.Test;

public class TestException {
    @Test(expected = SyntaxStudentException.class)
    public void shouldCheckGrade() {
        Main main = new Main();
        main.checkGrade(95);
    }
}
