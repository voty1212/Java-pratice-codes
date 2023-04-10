public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {

        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void draw(int x,int y,String color){
        System.out.println(String.format(String.valueOf(x),y,color));
    }
}
class MotherBoard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios)
    {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void loadProgram(String programName){
        System.out.println("Prgram "+programName+" is loading....");
    }
}
class ComputerCase extends Product{

    public String power;

    public ComputerCase(String model, String manufacturer, String power) {

        super(model, manufacturer);
        this.power = power;
    }

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void press(){
        System.out.println("On");
    }
}