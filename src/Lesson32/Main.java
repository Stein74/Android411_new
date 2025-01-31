package src.Lesson32;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(Arrays.asList("Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"));

        System.out.println("Список: " + list);

        ListIterator<String> it = list.listIterator();
        System.out.println("\nСписок итераторов в прямом направлении:");
        while (it.hasNext()){
            System.out.printf("Индекс = %d, Элемент = %s%n", it.nextIndex(), it.next());
        }

        System.out.println("\nСписок итераторов в обратном направлении:");
        while (it.hasPrevious()){
            System.out.printf("Индекс = %d, Элемент = %s%n", it.previousIndex(), it.previous());
        }
    }
}
