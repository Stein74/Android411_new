package src.Lesson31;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        String emptyString = "";
        String notEmptyStr = "Заполненная строка";

        Predicate<String> test = str -> str.isEmpty();

        System.out.printf("Строка %d: %s%nСтрока %1$d пустая: %b%n",
                1, emptyString, test.test(emptyString));
        System.out.printf("Строка %d: %s%nСтрока %1$d пустая: %b",
                2, notEmptyStr, test.test(notEmptyStr));
    }

}
