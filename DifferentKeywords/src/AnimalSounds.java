abstract class Animal {
public abstract void makeSound();
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bow");

    }

}



public class AnimalSounds{
    public static void main(String[] args) {
        Animal cat=new Cat();
        Animal dog=new Dog();
        cat.makeSound();
        dog.makeSound();
    }
}
