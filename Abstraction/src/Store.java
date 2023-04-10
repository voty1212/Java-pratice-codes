import java.util.ArrayList;
record OrderItem(int qty,Productforsale product){

}
public class Store {
    private static ArrayList<Productforsale> storeProducts=new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting",1322,"abs"));
        storeProducts.add(new ArtObject("fgaf",231,"vdfg"));
        listProducts();
    }
    public static void listProducts(){
        for (var item:storeProducts){
            item.showDetails();
        }
    }
    public static void additems(ArrayList<OrderItem> order,int orderItem,int qty){
        double salesTotal=0;
        for ()
    }
}
