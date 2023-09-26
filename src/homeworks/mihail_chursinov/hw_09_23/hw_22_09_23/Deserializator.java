package homeworks.mihail_chursinov.hw_09_23.hw_22_09_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserializator {

    //    public void readFile() throws IOException, ClassNotFoundException {
//        try (FileInputStream file = new FileInputStream("List.txt");
//             ObjectInputStream ois = new ObjectInputStream(file)) {
//            Rectangle rectangle = (Rectangle) ois.readObject();
//            System.out.println(rectangle);
//        }
//    }
    public List<Rectangle> readFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream("List.txt");
             ObjectInputStream ois = new ObjectInputStream(file)) {
            return (List<Rectangle>) ois.readObject();
        }
    }
}
