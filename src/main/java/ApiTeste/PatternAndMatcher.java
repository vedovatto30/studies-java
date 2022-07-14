package ApiTeste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher("abcdefghijklmnopq");
        while(matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }
    }
}
