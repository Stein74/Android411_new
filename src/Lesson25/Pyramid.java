package src.Lesson25;

public class Pyramid extends Figure{

    private int side1, side2, side3, height;

    public Pyramid(int side1, int side2, int side3, int height){
        super("Пирамида");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
        double volume = countVolume();
        super.setVolume(volume);
    }

    @Override
    double countVolume() {

        double hp = (side1 + side2 + side3) / 2.;
        double area = Math.sqrt(hp * (hp - side1) * (hp - side2) * (hp - side3));
        return 1./3 * area * height;
    }
}
