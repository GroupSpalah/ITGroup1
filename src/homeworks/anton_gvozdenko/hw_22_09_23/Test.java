package homeworks.anton_gvozdenko.hw_22_09_23;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serializator serializator = new Serializator();
        Deserializator deserializator = new Deserializator();
        Service service = new Service();
        Rectangle rectangle = new Rectangle(2,3);
        Rectangle rectangle1 = new Rectangle(3,5);
        serializator.addRectangle(rectangle);
        serializator.write();
        deserializator.read();

    }

}
