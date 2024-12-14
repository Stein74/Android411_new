package src.Lesson21;

public class Square {

    private static int count;

    public static double getTreangleSquare(int a, int h){
        count++;
        return (double) a * h / 2;
    }

    public static double getTreangleSquare(int a, int b, int c){
        count++;
        double p = (double) (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static int getSquare(int a){
        count++;
        return a * a;
    }

    public static int getRectangleSquare(int a, int b){
        count ++;
        return a * b;
    }

    public static int getCount(){
        return count;
    }
}
