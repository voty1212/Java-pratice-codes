import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
   private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag =true;
        ArrayList<String> groceries=new ArrayList<>();
        while(flag)
        {
            printActions();;
            switch (Integer.parseInt(scanner.nextLine())){
                case 1-> addItems(groceries);
                case 2-> removeItems(groceries);
                default -> flag=false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }
    private static void addItems(ArrayList<String> groceries)
    {
        System.out.println("Add items");
        String[] items=scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));
        for(String i:items){
            String trimmed=i.trim();
            if(groceries.indexOf(trimmed)<0){
                groceries.add(trimmed);
            }
        }
    }
    public static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove items");
        String[] items=scanner.nextLine().split(",");
        for (String i:items){
            String trimmed=i.trim();
            groceries.remove(trimmed);
        }
    }
    private static void printActions(){
       String textBlock= """
        Available options:
        0 shutdown
        1 add items
        2 remove items        
                
                
                """;
        System.out.println(textBlock+" ");
    }
}