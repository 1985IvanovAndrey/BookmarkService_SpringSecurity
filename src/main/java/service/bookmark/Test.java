package service.bookmark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("^(http?)");
        Matcher m=p.matcher("httpgddfgdfi.ua");
        if (m.find()){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
