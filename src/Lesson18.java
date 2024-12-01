package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson18 {
    public static void main(String[] args) {

        String str = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru, 1C@1c.com, почта@домен.рф";

        Pattern pat = Pattern.compile("[а-я\\w-.]+@([а-я\\w-]+.)+[a-zа-я]{2,3}");
        Matcher matcher = pat.matcher(str);

        while (matcher.find())
            System.out.println(matcher.group());

    }
}
