import java.util.ArrayList;
import java.util.Arrays;

record Grocery(String name,String type,int count){
    public Grocery(String name){
        this(name,"Dairy",1);
    }
}

public class Main {
    public static void main(String[] args) {
  Object[] groceryArray=new Object[3];
     groceryArray[0]=new Grocery("milk");
     groceryArray[1]=new Grocery("apples","Kashmir",50);
     groceryArray[2]="5 oranges";
        System.out.println(Arrays.toString(groceryArray));
        ArrayList objectlist=new ArrayList();
        objectlist.add(new Grocery("Butter"));
        objectlist.add("Curd");
        ArrayList<Grocery> grocery=new ArrayList<Grocery>();
        grocery.add(new Grocery("Butter"));
        System.out.println(grocery);




    }
}