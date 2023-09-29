package lessons.ls_09_23.ls_29_09_23;

import java.util.LinkedList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>(List.of("Hello", "World", "Friend"));

        strings
                .removeIf(s -> s.equals("World"));

        System.out.println(strings);
    }
}
