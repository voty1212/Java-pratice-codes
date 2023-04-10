public class Person {
    //this helps in using the particular instance of a variable
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
