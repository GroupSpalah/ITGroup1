package homeworks.anton_gvozdenko.hw_22_09_23;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializator {

        private List<Rectangle> rectangles;

    public Serializator() throws IOException {
            this.rectangles = new ArrayList<>();
        }
        public void addRectangle(Rectangle rectangle) throws IOException {
        rectangles.add(rectangle);}

   public void write() throws IOException {
        String filename = "Figure.dat";

        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(rectangles);
        fos.close();
        oos.close();

    }
}
