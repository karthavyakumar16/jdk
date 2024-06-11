package swiggy1;

public class OrderItem {
    public Product product;
    public String price;
    public String quantity;


    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
