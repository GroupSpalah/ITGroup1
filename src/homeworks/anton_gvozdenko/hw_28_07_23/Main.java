package homeworks.anton_gvozdenko.hw_28_07_23;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Translator translator = new Translator();
        translator.addNewWords("rus_eng", "Друг", "Friend");
        translator.addNewWords("rus_de", "Вечер", "Abend");
        translator.addNewLanguage("de_rus");
        translator.addNewWords("eng_rus", "Car", "Машина");
        translator.addNewWords("rus_eng", "Машина", "Car");
        translator.addNewWords("eng_rus", "Friend", "Друг");
        translator.addNewLanguage("spain_rus");
        translator.addNewWords("de_rus", "Tak", "Утро");

        translator.translateSentence("Машина Утро Друг", "rus_eng");
        translator.detectLanguage("Tak");

    }
}
