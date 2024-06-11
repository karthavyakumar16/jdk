package demo1;

public class Test {
    public static void main(String[] args) {

        State state=new State();
        Country country = new Country();
//State state=new State();
        country.name="india";
        country.numberCode="+91";
        country.currency="rupee";
country.state= state;
     System.out.println(country);


       // State state=new State();
        state.name="telangana";
        state.population="500000";
        state.language="telugu";
        state.country=country;
        System.out.println(state);

        District district=new District();
        district.name="khammam";
        district.pincode="507160";
        System.out.println(district);
    }
}
