import java.util.Arrays;

public class Anagramchecker {
    public static void main(String[] args) {
        String s1="parliament";
        String s2="partial men";
        boolean Anagram=checkAnagram(s1,s2);
        System.out.println(Anagram);
    }
    public static boolean checkAnagram(String s1,String s2){
        //Removing spaces
        s1=s1.replaceAll("[^a-zA-Z0-9]", "");
        s2=s2.replaceAll("[^a-zA-Z0-9]", "");

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

    return Arrays.equals(c1,c2);
    }
}
