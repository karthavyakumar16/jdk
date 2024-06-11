package swiggy;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {

    public RestarentList getrestarentlist() {
List<Restarent> restarent = new ArrayList<>();

RestarentList restarent1 = new RestarentList();
        restarent1.restarentList = restarent;
        List<Dish> itemList=new ArrayList<>();

        Dish bdish=new Dish();
        bdish.item="briyani";
        bdish.price="150";
        bdish.quantity="1";

        Dish cdish=new Dish();
        cdish.item="fry";
        cdish.price="200";
        cdish.quantity="1";

        itemList.add(bdish);
        itemList.add(cdish);

        Restarent restarent3=new Restarent();


return restarent1;



    }





}
