package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();
        Car car1=new Car();
        car1.name="p";
        Car car2=new Car();
        car2.name="p";
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);


        Address address2=new Address();
        address2.area="kphb";
        address2.flatNo="1-19";
        address2.street="grennhills";
        address2.pincode="507160";



        Address address3=new Address();
        address3.area="kphb";
        address3.flatNo="1-19";
        address3.street="grennhills";
        address3.pincode="507160";

        Set<Address> addressSet=new HashSet<>();
        addressSet.add(address2);
        addressSet.add(address3);
        System.out.println(addressSet);
    }
}
