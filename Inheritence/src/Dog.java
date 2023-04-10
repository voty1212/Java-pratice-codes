public class Dog extends Animal{

   private String breed;
   private String name;

    public Dog(String type, String size, double weight, String breed, String name) {
        super(type, size, weight);
        this.breed = breed;
        this.name = name;
    }

    public Dog(){
        super("Dogs","Medium",40);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    public Dog(String type, double weight, String breed, String name){
            super(type,weight<15? "small":(weight<35?"medium":"large"),weight);
            this.name=name;
            this.breed=breed;
    }
}
