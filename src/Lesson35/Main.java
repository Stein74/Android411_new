package src.Lesson35;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Object, Object> originalMap= new HashMap<>();
        originalMap.put("X", 1);
        originalMap.put("Y", 2);
        originalMap.put("Z", 3);

        System.out.println("Исходный map: " + originalMap);

        Map<Object, Object> swappedMap = new HashMap<>();
        originalMap.forEach((key, value) -> swappedMap.put(value, key));
        originalMap = swappedMap;
        System.out.println("Измененный map: " + originalMap);
    }
}
