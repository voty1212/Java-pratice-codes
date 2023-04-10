import java.util.Random;

public class Main {
    public static void main(String[] args) {
     Day day=Day.TUES;
        System.out.println(day);
        for (int i=0;i<10;i++)
        {day=getrandom();
            System.out.println(day.name());
            System.out.println(day.ordinal());
        }
    }
    public static Day getrandom(){
        int a=new Random().nextInt(7);
        var b=Day.values();
    return b[a];
     }
}