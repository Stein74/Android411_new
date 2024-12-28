package src.Lesson25;

public class Main {

    public static void main(String[] args) {

        Ball ball = new Ball(15);
        Cylinder cylinder = new Cylinder(15, 7);
        Pyramid pyramid = new Pyramid(3, 4, 5, 7);

        System.out.println(ball);
        System.out.println(cylinder);
        System.out.println(pyramid);
    }
}
