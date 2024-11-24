package src;

public class Lesson16 {

    public static void main(String[] args) {
        String[] strings = {"Лидер Венере не вредил", "Могу добавить", "Лазер резал"};

        for (String str: strings) {
            checkString(str);
        }
    }

    public static void checkString(String str){

        String strNoSpace = str.replaceAll("\s","");
        String reversed = new StringBuilder(strNoSpace).reverse().toString();

        System.out.println(str + ": " + strNoSpace.equalsIgnoreCase(reversed));
    }
}
