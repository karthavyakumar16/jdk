package siwggydemo;

import java.util.ArrayList;
import java.util.List;

public class SwiigyService {
        public ResturantList getResturant(){
            Address paradiseAddress=new Address();
            paradiseAddress.flatNo="101";
            paradiseAddress.area="miyapur";
            paradiseAddress.street="vaishali nagar";
            paradiseAddress.pinCode="500700";

            Address subwayAddress=new Address();
            subwayAddress.flatNo="199";
            subwayAddress.area="lbnagar";
            subwayAddress.street="v nagar";
            subwayAddress.pinCode="500090";

            Address roastAddress=new Address();
            roastAddress.flatNo="111";
            roastAddress.area="srnagar";
            roastAddress.street="rsnagar";
            roastAddress.pinCode="511090";

            List<Address> addressList=new ArrayList<>();
            addressList.add(paradiseAddress);
            addressList.add(subwayAddress);
            addressList.add(roastAddress);






            Resturant paradisy=new Resturant();
            paradisy.name="paradisy";
            paradisy.rating=3.5;
            paradisy.address= paradiseAddress;
            paradisy.dishesList=paradisy.dishesList;

            Resturant subway=new Resturant();
            subway.name="sub way";
            subway.rating=4.2;
            subway.address= subwayAddress;
            subway.dishesList=subway.dishesList;

            Resturant roast=new Resturant();
            roast.name="paradisy";
            roast.rating=4.0;
            roast.address= roastAddress;
            roast.dishesList=roast.dishesList;

            Dishes biryanis=new Dishes();
            biryanis.dishName="hydrabadi biryani";
            biryanis.dishPrice=550;

            Dishes breads=new Dishes();
            breads.dishName="kulcha";
            breads.dishPrice=25;

            Dishes chinese =new Dishes();
            chinese.dishName="manchuria";
            chinese.dishPrice=250;

            List<Dishes> dishesList=new ArrayList<>();
            dishesList.add(biryanis);
            dishesList.add(breads);
            dishesList.add(chinese);
            paradisy.dishesList=dishesList;
            subway.dishesList=dishesList;
            roast.dishesList=dishesList;
            List<Resturant> resturantList=new ArrayList<>();
            resturantList.add(paradisy);
            resturantList.add(subway);
            resturantList.add(roast);
            ResturantList resturantList1=new ResturantList();
            resturantList1.resturantList=resturantList;



            return resturantList1;
        }
    }


