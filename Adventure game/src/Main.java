import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations=new HashMap<Integer,Location>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        locations.put(0,new Location(0,"You are here at 1"));
        locations.put(1,new Location(1,"You are here at 2"));
        locations.put(2,new Location(2,"You are here at 3"));
        locations.put(3,new Location(3,"You are here at 4"));
        locations.put(4,new Location(4,"You are here at 5"));
        locations.put(5,new Location(5,"You are here at 6"));

        locations.get(1).addExit("W",2);
        locations.get(2).addExit("E",3);
        locations.get(3).addExit("S",4);
        locations.get(4).addExit("N",5);
        locations.get(1).addExit("Q",0);





        int loc=1;
         while(true){
             System.out.println(locations.get(loc).getDescription());
             if(loc==0)
                 break;
             loc=scanner.nextInt();
             if(!locations.containsKey(loc)){
                 System.out.println("Error");
             }
         }

    }
}