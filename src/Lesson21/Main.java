package src.Lesson21;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Площадь треугольника по формуле Герона (3, 4, 5): %.1f%n", Square.getTreangleSquare(3, 4, 5));
        System.out.printf("Площадь треугольника через основание и высоту (6, 7): %.1f%n", Square.getTreangleSquare(6, 7));
        System.out.printf("Площадь квадрата (7): %d%n", Square.getSquare(7));
        System.out.printf("Площадь прямоугольника (2, 7): %d%n", Square.getRectangleSquare(2, 6));
        System.out.println("Количество подсчетов площади: " + Square.getCount());
    }
}
