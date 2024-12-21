package src.Lesson23;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Box3D box = new Box3D(5, 3, 2);
        System.out.println(box);
        System.out.printf(Locale.ROOT, "Объем: %.1f%n", box.getVolume());

        box.setParameters(10, 5, 7);
        System.out.printf(Locale.ROOT, "%nНовые значения%n" +
                "Ширина: %.1f%n" +
                "Высота: %.1f%n" +
                "Глубина: %.1f%n",
                box.getWidth(), box.getHight(), box.getDepth());
        System.out.println(box);
        System.out.printf(Locale.ROOT, "Объем: %.1f%n", box.getVolume());

        try {
            box.setParameters(-10, 5, 7);
            System.out.printf(Locale.ROOT, "%nНовые значения%n" +
                            "Ширина: %.1f%n" +
                            "Высота: %.1f%n" +
                            "Глубина: %.1f%n",
                    box.getWidth(), box.getHight(), box.getDepth());
            System.out.println(box);
            System.out.printf(Locale.ROOT, "Объем: %.1f", box.getVolume());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
