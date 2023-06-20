package lessons.lessons.ls_16_06_23;

import java.io.IOException;

public class NotCreatedPdfException extends IOException {
    public NotCreatedPdfException(String message) {
        super(message);
    }
}
