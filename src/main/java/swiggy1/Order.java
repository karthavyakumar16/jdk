package swiggy1;

public class Order {
    public OrderItem orderItem;
    public String price;
    public Address address;
    public String orderDate;
    public String orderId;

    @Override
    public String toString() {
        return "Order{" +
                "orderItem=" + orderItem +
                ", price='" + price + '\'' +
                ", address=" + address +
                ", orderDate='" + orderDate + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
