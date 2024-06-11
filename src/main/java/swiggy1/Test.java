package swiggy1;

public class Test {
    public static void main(String[] args) {
        Address address=new Address();
        address.hNo="1-79";
        address.streetNo="2-39";
        address.area="lahari";
        address.pinCode="507160";


        Product product=new Product();
        product.productName="curdrice";
        product.quantity="2";
        product.productPrice="100";
        product.vendor="LUCKY";

        OrderItem orderItem=new OrderItem();
        orderItem.product=product;
        orderItem.quantity="2";
        orderItem.price="100";

        Order order=new Order();
        order.orderItem=orderItem;
        order.price="100";
        order.address=address;
        order.orderDate="31-03-2024";
        order.orderId="12";


        System.out.println(address);
        System.out.println(product);
        System.out.println(orderItem);
        System.out.println(order);
    }
}
