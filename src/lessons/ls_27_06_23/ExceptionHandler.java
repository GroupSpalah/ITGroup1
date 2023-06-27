package lessons.ls_27_06_23;

import java.io.IOException;

public class ExceptionHandler {

    public void print() throws IOException {
        throw new IOException("I'm exception");
    }
}
