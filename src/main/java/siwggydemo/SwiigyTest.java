package siwggydemo;

import java.util.Scanner;

public class SwiigyTest {
    public static void main(String[] args) {
        SwiigyService swiigyService=new SwiigyService();
        ResturantList resturantList=swiigyService.getResturant();
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER YOUR RESTURENT:");
        String name=input.nextLine();
        System.out.println("restarent name"+name);

        RestarentService restarentService=new RestarentService();
        Resturant selectrestarent=restarentService.selectRestarent(resturantList,name);

        System.out.println(resturantList);

    }
}
