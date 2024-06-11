package creditCard;

import java.util.List;

public class Shop {
    public List<Product> productList;


    public boolean selectProduct(String product, String colour) {
        for (Product product1 : productList) {
            if (productList.contains(product1) && product1.productSpecification.color.equals(colour)) {
                System.out.println(" Product found " + product1);
            } else {
                System.out.println(" Product Not Found ");
            }
        }
        return false;
    }
}
