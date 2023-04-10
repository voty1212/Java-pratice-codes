public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        Thread another=new anotherthread();
        another.start();
        System.out.println("Hello");
    }
}