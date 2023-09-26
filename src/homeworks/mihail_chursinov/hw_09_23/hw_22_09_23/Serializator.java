package homeworks.mihail_chursinov.hw_09_23.hw_22_09_23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializator {
        private List<Rectangle> rectangles;

        public Serializator() {
            this.rectangles = new ArrayList<>();
        }

        public void addRectangle(Rectangle rectangle) {
            rectangles.add(rectangle);
        }

        public void writeFile() throws IOException {
            String fileName = "List.txt";

            try (FileOutputStream file = new FileOutputStream(fileName);
                 ObjectOutputStream oos = new ObjectOutputStream(file)) {
                oos.writeObject(rectangles);
            }
        }
}
