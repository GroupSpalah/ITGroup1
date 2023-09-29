package homeworks.mihail_chursinov.hw_09_23.hw_22_09_23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserializator {

    public static final String NAME_FILE = "List.dat";

    public static List<Rectangle> readFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(NAME_FILE);
             ObjectInputStream ois = new ObjectInputStream(file)) {
            return (List<Rectangle>) ois.readObject();
        }
    }
}
