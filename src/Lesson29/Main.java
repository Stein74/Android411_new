package src.Lesson29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Исходная строка: ");

        try {
            checkForVowels(scanner.nextLine());
        }catch (OutOfVowelException e){
            System.out.print(e.getMessage());
        }
    }

    public static void checkForVowels(String str) throws OutOfVowelException{
        Pattern pattern = Pattern.compile("[ёуеыаоэяиюeuioay]");
        Matcher matcher = pattern.matcher(str.toLowerCase());
        if (!matcher.find())
            throw new OutOfVowelException();
    }

}

class OutOfVowelException extends Exception {

    public OutOfVowelException(){
        super("Ошибка: Строка не содержит гласные буквы");
    }

}
