package src.Lesson28;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов числового массива: ");
        //Integer[] intArray = new Integer[scanner.nextInt()];
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.print("-> ");
//            intArray[i] = scanner.nextInt();
//        }
        Integer[] intArray = inputArrayData(Integer.class);

        System.out.print("Введите количество элементов массива строк: ");
        String[] strArray = inputArrayData(String.class);
/*        String[] strArray = new String[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < strArray.length; i++) {
            System.out.print("-> ");
            strArray[i] = scanner.nextLine();
        }*/

        printArray(intArray);
        printArray(strArray);
    }

    public static <T> T[] inputArrayData(Class type){
        T[] array = (T[]) Array.newInstance(type, scanner.nextInt());
        scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            if (type.getName().equals("java.lang.Integer"))
                array[i] = (T) Integer.valueOf(scanner.nextLine());
            else array[i] = (T) scanner.nextLine();
        }
        return array;
    }

    public static <T> void printArray(T[] array) {
        System.out.print("Массив: ");
        for (T val : array)
            System.out.print(val + " ");
        System.out.println();
    }
}
