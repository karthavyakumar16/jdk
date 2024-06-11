package streamdemo;

public class User {
    public String name;
    public String dob;
    public String adarNo;
    public Address address;
    public boolean equals(Object obj){
        if(this==obj){
            return  true;

        }
        if(this.getClass()!=obj.getClass()){
            return false;

        }
        User user=(User) obj;
        return this.adarNo.equals(user.adarNo);
    }
    public int hashCode(){
        return this.adarNo.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", adarNo='" + adarNo + '\'' +
                ", address=" + address +
                '}';
    }
}
