package src.Lesson25;

public class Ball extends Figure {

    private int radius;

    public Ball(int radius){
        super("Шар");
        this.radius = radius;
        double volume = countVolume();
        super.setVolume(volume);
    }

    @Override
    double countVolume() {
        return 4./3 * Math.PI * Math.pow(radius, 3);
    }
}
