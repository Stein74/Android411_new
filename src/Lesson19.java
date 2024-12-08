package src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = "Введите номер телефона. Завершение ввода: -1: ";
        Pattern pattern = Pattern.compile("\\+?[78]\\s?((\\(\\d{3}\\))|(\\d{3}))\\s?\\d{3}[\\s-]?\\d{2}[\\s-]?\\d{2}");

        while (true){
            System.out.print(message);
            String input = scanner.nextLine();
            if (input.equals("-1")) break;

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                System.out.printf("Тедефон %s верный\n", input);
            } else {
                System.out.printf("Тедефон %s не верный\n", input);
            }
        }

    }
}
