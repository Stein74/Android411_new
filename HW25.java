import java.util.Arrays;

public class HW25 {

    public static int[] array = {-2, 3, -8, -11, -4, -6};

    public static void main(String[] args) {

        int count = countNegative(0, 0);
        System.out.println(Arrays.toString(array));
        System.out.println("n = " + count);
    }

    public static int countNegative(int index, int count){
        if (array[index] < 0)
            count++;
        if (index < array.length - 1)
            count = countNegative(index + 1, count);
        return count;
    }
}
