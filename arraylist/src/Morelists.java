import java.util.ArrayList;
import java.util.List;

public class Morelists {
    public static void main(String[] args) {
        String[] items={"Apples","Bananas","Milk","Butter"};
        List<String> list=List.of(items);
        System.out.println(list);
        ArrayList<String> groceries=new ArrayList<>(list);
        groceries.add("Curd");
        System.out.println(groceries);
        ArrayList<String>  nextList=new ArrayList<>(
                List.of("Pickles","Mustards","Cheese"));
        System.out.println(nextList);
        groceries.addAll(nextList);
        System.out.println(groceries);
        if(groceries.contains("Curd"))
        {
            groceries.add("Curd");
            System.out.println("First index is "+groceries.indexOf("Curd"));

            System.out.println("Last index is "+groceries.lastIndexOf("Curd"));
            System.out.println(groceries);
            groceries.removeAll(List.of("Curd"));
        }
        System.out.println(groceries);

    }

}
