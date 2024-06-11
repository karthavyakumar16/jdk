package swiggy;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dish veg=new Dish();
        veg.item="curdrice";
        veg.price="100";
        veg.quantity="2";



        Dish nonveg=new Dish();
        nonveg.item="rice";
       nonveg.price="100";
        nonveg.quantity="2";
        Restarent mehfil=new Restarent();
        Restarent lucky=new Restarent();

        Restarent restarent=new Restarent();
        List<Dish>items=new ArrayList<>();
        items.add(veg);
        items.add(nonveg);
       restarent.itemList=items;

       SwiggyService swiggyService=new SwiggyService();
    }
}
