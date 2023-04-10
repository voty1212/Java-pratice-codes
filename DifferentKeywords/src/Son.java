
public class Son extends Father{
    private String looksson(){
        String looks="Face features";
        return looks;
    }
    private String heightson(){
        String height="Height";
        return height;
    }
    private String Charecteristicsson(){
        String Charecteristics="Charecteristics";
        return Charecteristics;
    }
    public String myAppearance(){
        String looks=looksson();
        String height=heightson();
        String Charecteristics=Charecteristicsson();
        String appearance=looks+height+Charecteristics;
        return appearance;
    }
    String appearance=Appearance()+myAppearance();
}
