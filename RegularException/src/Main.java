import java.util.regex.*;

public class Main{
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z&&[^m-q]]","q"));

    }}