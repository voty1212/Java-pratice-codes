public class Car {
    private String description;
    public Car (String description)
    {
        this.description=description;
    }
    public void startEngine(){
        System.out.println("Car->startEngine");
    }
    public void runEngine(){
        System.out.println("Car->Runengine");
    }
    public void drive(){
        System.out.println("Car_>Driving, type "+ getClass().getSimpleName());
        runEngine();
    }
}
