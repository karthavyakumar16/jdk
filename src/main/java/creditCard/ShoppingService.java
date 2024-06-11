package creditCard;

public class ShoppingService {
    public Product selectproduct(ProductSpecification productSepcification){
        Product product=new Product();
        product.size=productSepcification.size;
        product.color=productSepcification.color;
        product.brand=productSepcification.brand;
        product.type=productSepcification.type;
        product.price=2500;
        return product;





    }
}
