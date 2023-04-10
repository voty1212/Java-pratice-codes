//Inheritance used in case of father son appearance.
public class Father {
    private int age;
    private String name;
   private String looks(){
       String looks="Face features";
       return looks;
   }
   private String height(){
       String height="Height";
       return height;
   }
   private String Charecteristics(){
       String Charecteristics="Charecteristics";
       return Charecteristics;
   }
    public String Appearance(){
       String looks=looks();
       String height=height();
       String Charecteristics=Charecteristics();
       String appearance=looks+height+Charecteristics;
       return appearance;
    }

}
