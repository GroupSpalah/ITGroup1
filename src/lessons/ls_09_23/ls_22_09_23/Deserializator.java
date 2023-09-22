package lessons.ls_09_23.ls_22_09_23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializator {
    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Man.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ManSer manSer = (ManSer) ois.readObject();

        System.out.println(manSer);

        fis.close();
        ois.close();
    }
}
