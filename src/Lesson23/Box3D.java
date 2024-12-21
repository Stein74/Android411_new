package src.Lesson23;

import java.util.Locale;

public class Box3D extends Box{

    private float depth;

    public Box3D(float width, float hight, float depth) {
        super(width, hight);
        setDepth(depth);
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        if (depth < 0){
            throw new IllegalArgumentException("Значение глубины должно быть положительным");
        }
        this.depth = depth;
    }

    public float getVolume(){
        return super.getArea() * depth;
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "Объект Box3D{ширина = %.1f, " +
                "высота = %.1f , " +
                "глубина = %.1f ",
                super.getWidth(), super.getHight(), getDepth());
    }

    public void setParameters(float width, float height, float depth){
        super.setParameters(width, height);
        setDepth(depth);
    }
}
