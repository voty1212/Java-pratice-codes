public class Main {
    public static void main(String[] args) {
     Animal animal=new Animal("Mammal","Huge",4000);
     Dog dog=new Dog();
     doAnimalStuff(dog,"45 kmph");
     //doAnimalStuff(animal,"50 kmph");
    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}