package src.Lesson25;

public class Cylinder extends Figure{

    private int radius, height;

    public Cylinder(int radius, int height){
        super("Цилиндр");
        this.radius = radius;
        this.height = height;
        double volume = countVolume();
        super.setVolume(volume);
    }

    @Override
    double countVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

}
