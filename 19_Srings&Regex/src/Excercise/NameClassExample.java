package Excercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public NameClassExample(){
        pattern = Pattern.compile(NAME_REGEX);
    }
    public boolean validate (String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
