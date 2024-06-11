package creditCard;


import java.util.ArrayList;
import java.util.List;

public class ShopDemoTest {
        public static void main(String[] args) {

            Product shirtProduct = new Product();
            ProductSpecification productSpecification = new ProductSpecification();
            productSpecification.size = 28;
            productSpecification.color = "Black";
            productSpecification.price = 3000;
            shirtProduct.type = "Shirts";


            Product tShirtProduct = new Product();
            ProductSpecification tShirtProductSpecification = new ProductSpecification();
            tShirtProductSpecification.size = 26;
            tShirtProductSpecification.color = "Black";
            tShirtProductSpecification.price = 2500;
            tShirtProduct.type = "TShirt";
            tShirtProduct.productSpecification=tShirtProductSpecification;

            Product jeansProduct = new Product();
            ProductSpecification jeansProductSpecification = new ProductSpecification();
            jeansProductSpecification.size = 30;
            jeansProductSpecification.color = "White";
            jeansProductSpecification.price = 2000;
            jeansProduct.type = "Jeans";
            jeansProduct.productSpecification = jeansProductSpecification;

            Shop shop = new Shop();
            List<Product> productList = new ArrayList<>();
            productList.add(shirtProduct);
            productList.add(tShirtProduct);
            productList.add(jeansProduct);

            shop.productList = productList;
            String wantColor="White";
            String wantProduct="Jeans";
            if(shop.selectProduct( wantProduct,wantColor)){
                System.out.println("ok");
            }
        }
    }
