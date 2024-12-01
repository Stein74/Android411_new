package src;

public class Lesson17 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("  Текст с повторяющимися символами ");
        System.out.println("Исходная строка - \"" + sb.toString() + "\"");

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ')
                sb.deleteCharAt(i--);
            else {
                String symbol = String.valueOf(sb.charAt(i));
                int index = sb.lastIndexOf(symbol);
                while (index > i) {
                     sb = sb.deleteCharAt(index);
                     index = sb.lastIndexOf(symbol);
                }
            }
        }

        System.out.println("Измененная строка - \"" + sb.toString() + "\"");
    }
}
