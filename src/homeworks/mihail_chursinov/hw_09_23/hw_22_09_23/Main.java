package homeworks.mihail_chursinov.hw_09_23.hw_22_09_23;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rectangle rectangle = new Rectangle(10.0, 20.02);
        Serializator serializator = new Serializator();
        Deserializator deserializator = new Deserializator();
        RectangleService rectangleService = new RectangleService();

        serializator.addRectangle(rectangle);
        serializator.writeFile();
        deserializator.readFile();
        rectangleService.showObjectMaxSquare();

    }
}

