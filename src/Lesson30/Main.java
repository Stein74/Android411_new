package src.Lesson30;

public class Main {

    interface Word{
        String getShortestWord(String w1, String w2);
    }

    public static void main(String[] args) {

        String word1 = "Собака";
        String word2 = "Кот";

        System.out.println("Первое слово: " + word1);
        System.out.println("Второе слово: " + word2);

        String shortest = getShortest((w1, w2) -> w1.length() < w2.length() ? w1 : w2, word1, word2);

        System.out.println("Самое короткое слово: " + shortest);
    }

    static String getShortest(Word word, String w1, String w2){
        return word.getShortestWord(w1, w2);
    }
}
