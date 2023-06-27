import lessons.ls_27_06_23.ExceptionHandler;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

public class WorkWithException {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test(expected = IOException.class)
    public void shouldThrowException() throws IOException {
        ExceptionHandler handler = new ExceptionHandler();

        handler.print();
    }

    @Test
    public void shouldThrowExceptionUsingRule() throws IOException {
        ExceptionHandler handler = new ExceptionHandler();

        expectedException.expect(IOException.class);
        expectedException.expectMessage("I'm exception");

        handler.print();

    }
}
