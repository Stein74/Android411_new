package src.Lesson25;

public abstract class Figure {

    private String figureName;
    private double volume;

    public Figure(String name){
        figureName = name;
    }

    abstract double countVolume();

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("Фигура: %-10s| Объем фигуры: %.2f",
                figureName, getVolume());
    }
}
