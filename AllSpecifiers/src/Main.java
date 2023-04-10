public class Main {
    public static void main(String[] args) {
        parent p=new parent();
        Child c=new Child();
        System.out.println(p.pc);
        System.out.println(p.p4);
        System.out.println(c.pv3);
        System.out.println(c.pc);
        System.out.println(c.p4);
        //From the main class parent can't access the protected and private variables
        //wheras the child class can't access only the private variable.
    }
}
