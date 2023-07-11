package lessons.homeworks.anton_gvozdenko.hw_07_07_23;

import java.util.LinkedList;
import java.util.List;

public class NewList {
    public static void main(String[] args) {
        LinkedList<String> letters = new LinkedList<>();
        letters.add("qwe");
        letters.add("qsd");
        letters.add("qxc");
        for (String letter : letters) {
            String replace = letter.replace("q", "i");
            System.out.println(replace);
        }
    }
}

