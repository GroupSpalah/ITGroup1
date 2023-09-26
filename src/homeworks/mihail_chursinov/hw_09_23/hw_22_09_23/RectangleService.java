package homeworks.mihail_chursinov.hw_09_23.hw_22_09_23;


import homeworks.mihail_chursinov.hw_09_23.hw_12_09_23.Geese;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RectangleService {

    public void findObjectMaxSquare(Deserializator deserializator) throws IOException, ClassNotFoundException {
        List<Rectangle> rectangles = deserializator.readFile();
        Comparator<Rectangle> comparator = Comparator.comparing(Rectangle::calculateSquare);

        Optional<Rectangle> maxSquare = rectangles
                .stream()
                .max(comparator);
        if (maxSquare.isPresent()) {
            Rectangle rectangle = maxSquare.get();
            System.out.println(rectangle);

        }
    }
}
