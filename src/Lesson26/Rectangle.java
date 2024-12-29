package src.Lesson26;

public class Rectangle implements Resizable{

    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "width: " + width +
                ", height: " + height;
    }
}
