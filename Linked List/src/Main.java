import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<>();
        placesToVisit.add("Delhi");
        placesToVisit.add(0,"Chennai");
        addelements(placesToVisit);
        String previousTown=placesToVisit.getFirst();
        ListIterator<String> iterator=placesToVisit.listIterator();
        while(iterator.hasNext())
        {
            var town=iterator.next();
            System.out.println("From: "+previousTown+" to "+town);
            previousTown=town;
        }
        System.out.println(placesToVisit);
    }
    public static void addelements(LinkedList<String> List){
        List.add("Pune");
        List.offer("Bhopal");
        List.addLast("Kochi");
        List.offerLast("Mumbai");
        List.push("Mumbai");
    }
    public static void removeElements(LinkedList<String> List){
        List.remove(4);



    }
}