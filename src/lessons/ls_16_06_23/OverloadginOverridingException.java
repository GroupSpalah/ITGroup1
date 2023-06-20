package lessons.lessons.ls_16_06_23;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class OverloadginOverridingException {

}

class Parent {

    public void print() throws IOException {

    }
}
class Child extends Parent {

    @Override
    public void print() throws FileAlreadyExistsException, FileNotFoundException {

    }
}
