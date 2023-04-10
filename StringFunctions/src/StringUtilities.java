public class StringUtilities {
    private StringBuilder sBuilder=new StringBuilder();
    private int charsadded=0;
    public void  addChar(StringBuilder sBuilder,char c){
        sBuilder.append(c);
        charsadded++;
    }
    public String uppr(String str){
        String u=str.toUpperCase();
        return "Prefix "+u;
    }
    public String su(String str){
        return str+" Suffix";
    }
}
