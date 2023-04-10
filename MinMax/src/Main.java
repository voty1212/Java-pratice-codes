import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = -1922;

        double min = 123131;
        int loopcount = 0;
        while (true)
        {
            System.out.println("Enter char");
            String nextentry=scanner.nextLine();

            try{
                double valid =Double.parseDouble(nextentry);
                if(valid<min)
                    min=valid;
                else if(valid>max)
                    max=valid;
            }

            catch(NumberFormatException nfe){
                break;
            }
        }

        System.out.println("Max is"+ max);
        System.out.println("Min is"+min);
    }
}