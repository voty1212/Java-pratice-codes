public class car{
private String make="Maruti Suzuki";
private  String model="Zen";
private  String color="White";
private int doors=4;
private boolean convertible=false;
public void describeCar(){
    System.out.println(doors+" Door "+ color+" "+make
    +" "+model+" "+(convertible?"Convertible":""));
}
public String getMake(){
    return make;
}
public String getModel()
{
    return model;
}
public String getColor()
{
    return color;
}
public void setMake(String make)
{
    this.make=make;
}
public void setModel(String model){
    this.model=model;
}
public void setColor(String color){
    this.color=color;
}
public void setDoors(int doors){
    this.doors=doors;
}
public void setConvertible(boolean convertible)
{
    this.convertible=convertible;
}

}






