package src.Lesson26;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(100, 150);

        System.out.println(rectangle);
        rectangle.resizeWidth(250);
        rectangle.resizeHeight(300);
        System.out.println(rectangle);
    }
}
