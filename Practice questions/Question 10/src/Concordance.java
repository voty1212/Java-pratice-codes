import java.util.*;

public class Concordance {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Concordance <string>");
            return;
        }

        String input = args[0];
        Map<Character, List<Integer>> concordance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!concordance.containsKey(c)) {
                concordance.put(c, new ArrayList<>());
            }
            concordance.get(c).add(i);
        }

        System.out.println(concordance);
    }
}
