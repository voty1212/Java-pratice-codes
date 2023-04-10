public class Main {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            Student s=new Student("s2333"+i,switch (i){
                case 1->"Srini";
                case 2->"Dazzle";
                case 3->"Srishti";
                case 4->"Devansh";
                case 5->"Seth";
                default -> "Anonymous";},"15/04/2001",
                    "JavaMaterclass");
            System.out.println(s);
            }
        }
    }

