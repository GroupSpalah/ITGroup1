package homeworks.anton_gvozdenko.hw_22_09_23;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserializator {
    public static List<Rectangle> read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Figure.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Rectangle> rectangles1 = (List<Rectangle>) ois.readObject();

        System.out.println(rectangles1);

        fis.close();
        ois.close();

        return rectangles1;
    }
}
