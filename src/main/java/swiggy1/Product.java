package swiggy1;

public class Product {
    public String productName;
    public String productPrice;
    public String vendor;
    public String quantity;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", vendor='" + vendor + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
