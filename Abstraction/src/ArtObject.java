public class ArtObject extends Productforsale{
    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(price);
        System.out.println(description);
    }
}
