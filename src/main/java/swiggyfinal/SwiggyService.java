package swiggyfinal;

public class SwiggyService {

public void orderProcess(){
    Swiggy swiggy=new Swiggy();

    Dish dish1=new Dish("mutton",400);
    Dish dish2=new Dish("fish",500);
    Dish dish3=new Dish("biriyani",600);

    Address address1=new Address("1-79","shivalayam","kphb","507160");
    Restaurant restaurant2=new Restaurant("pistahouse",address1);

    restaurant2.dishList.add(dish1);
    restaurant2.dishList.add(dish2);
    restaurant2.dishList.add(dish3);

    Address address2=new Address("1-23","greenhills","kphb","506072");
    Restaurant restaurant3=new Restaurant("kfc",address2);

    restaurant3.dishList.add(dish1);
    restaurant3.dishList.add(dish2);
    restaurant3.dishList.add(dish3);

    swiggy.addRestaurant(restaurant2);
    swiggy.addRestaurant(restaurant3);

    Login login=new Login();
    boolean loginstatus=login.login("karthavya","96522");


}


}
