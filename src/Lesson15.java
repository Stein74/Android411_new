package src;

import java.util.regex.Pattern;

public class Lesson15 {

    public static void main(String[] args) {

        String str = "Hello, World! _ Привет, мир!";

        System.out.printf("Дана строка - \"%s\"\n", str);
        System.out.printf("Количество строчных букв - %d, количество прописных букв - %d",
                    str.replaceAll("[A-Z_\\d\\W]", "").length(),
                    str.replaceAll("[a-z_\\d\\W]", "").length());
    }
}
