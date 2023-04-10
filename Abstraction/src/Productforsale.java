public abstract class Productforsale {


protected String type;
protected double price;
protected String description;

    public Productforsale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public double getSales(int qty){
        return qty*price;
    }
    public void printpriced(int qty){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",qty,price,type,description);

    }
    public abstract void showDetails();

}
