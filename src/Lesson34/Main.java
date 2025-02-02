package src.Lesson34;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static HashMap<String, Color> map = new HashMap<>();

    public static void main(String[] args) {
        putEntry("red");
        putEntry("orange");
        putEntry("aqua");
        putEntry("pink");
        putEntry("gray");
        putEntry("blue");
        putEntry("white");
        putEntry("black");
        putEntry("yellow");
        putEntry("brown");

        int i = 0;
        for (Map.Entry<String, Color> pair: map.entrySet()){
            System.out.printf("%d) %s: %s%n", ++i, pair.getKey(), pair.getValue());
        }
    }

    private static void putEntry(String val){
        map.put(val, new Color(val));
    }

}
class Color{
    private String colorUC;

    public Color(String name){
        this.colorUC = name.toUpperCase();
    }

    @Override
    public String toString() {
        return colorUC;
    }
}
