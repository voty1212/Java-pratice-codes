import java.util.Scanner;

public class Area {
    //Final keyword is used to make a variable a constant
    public static void main(String[] args) {


    final double pi=3.13;
   double radius;
        Scanner scanner=new Scanner(System.in);
        radius=scanner.nextDouble();
        System.out.println(pi*radius*radius);

    }}
