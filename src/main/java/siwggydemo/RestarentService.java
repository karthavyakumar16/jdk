package siwggydemo;

public class RestarentService {

    public Resturant resturantName;
    RestarentService(){
        resturantName=new Resturant();
    }
    public Resturant selectRestarent(ResturantList resturantList,String name){
        for(Resturant resturant: resturantList.resturantList){
            if(resturant.name.equalsIgnoreCase(name)){
                System.out.println("restarent found"+name);

            }else{
                System.out.println("restarent not found");
            }
        }
return resturantName;

    }
}
