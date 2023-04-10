import java.util.*;
public class Main {
    public static void main(String[] args) {


    String p1="This is a test paragraph to find duplicate words. This will have the number of times it has been repeated";
    String[] words=p1.split("[\\s.,]+");
    List<String> l=Arrays.asList(words);
    Map<String,Integer> counter=new HashMap<>();
        for (String w:l) {
            if (counter.containsKey(w)){
                 counter.put(w,counter.get(w)+1);
        }else{
                counter.put(w,1);
            }

        }
        List<Map.Entry<String,Integer>> sl=new ArrayList<>(counter.entrySet());
        Collections.sort(sl, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                return t1.getValue().compareTo(stringIntegerEntry.getValue());
            }
        });
        for (Map.Entry<String,Integer> entry:sl){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue()+" times");
            }
        }

}}