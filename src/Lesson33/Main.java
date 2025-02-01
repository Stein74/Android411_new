package src.Lesson33;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите целые числа, 00 - завершение ввода.");

        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        while (true){
            System.out.print("-> ");
            String str = scanner.nextLine();
            if (str.equals("00")) {
                break;
            } else if (str.matches("\\d+")) {
                set.add(Integer.valueOf(str));
            } else System.out.println("Введенное значение не соответстветствует условиям ввода");
        }
        scanner.close();

        if (set.size() > 0) {
            System.out.println("Наименьший элемент в TreeSet: " + set.getFirst());
        }else System.out.println("В коллекции отсутствуют элементы");
    }
}
