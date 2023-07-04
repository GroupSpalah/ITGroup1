package anton_gvozdenko;

import homeworks.anton_gvozdenko.hw_20_06_23.exception.Exception;
import homeworks.anton_gvozdenko.hw_20_06_23.exception.SyntaxStudentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestStudentException {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test(expected = SyntaxStudentException.class)

    public void shouldThrowException() throws SyntaxStudentException{
        Exception exception = new Exception();

        exception.gradeCheck(100);

    }
    @Test
    public void shouldThrowExceptionUsingRule() throws SyntaxStudentException{
        Exception exception = new Exception();
        expectedException.expect(SyntaxStudentException.class);
        expectedException.expectMessage("You are an exceptionally awesome student");
        exception.gradeCheck(100);
    }


}
