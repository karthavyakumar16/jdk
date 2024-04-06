package siwggydemo;

public class SwiigyTest {
    public static void main(String[] args) {
        SwiigyService swiigyService=new SwiigyService();
        ResturantList resturantList=swiigyService.getResturant();
        System.out.println(resturantList);

    }
}
