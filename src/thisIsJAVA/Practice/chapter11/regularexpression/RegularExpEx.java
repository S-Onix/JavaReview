package thisIsJAVA.Practice.chapter11.regularexpression;

import java.util.regex.Pattern;

public class RegularExpEx {
    public void run(){
        String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        String compare1 = "aaaa@gamil.com";
        String compare2 = "bbbb@gmailcom";

        boolean result = Pattern.matches(regExp,compare1);
        boolean result2 = Pattern.matches(regExp, compare2);

        System.out.println(result + " " + result2);
    }
}
