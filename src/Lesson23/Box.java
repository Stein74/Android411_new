package src.Lesson23;

public class Box {
    private float width, hight;

    public Box(float width, float hight) {
        setWidth(width);
        setHight(hight);
    }

    public void setWidth(float width) {
        if (width < 0){
            throw new IllegalArgumentException("Значение ширины должно быть положительным");
        }
        this.width = width;
    }

    public void setHight(float hight) {
        if (hight < 0){
            throw new IllegalArgumentException("Значение высоты должно быть положительным");
        }
        this.hight = hight;
    }

    public void setParameters(float height, float widht){
        setHight(height);
        setWidth(widht);
    }

    public float getArea(){
        return hight * width;
    }

    public float getWidth() {
        return width;
    }

    public float getHight() {
        return hight;
    }
}
