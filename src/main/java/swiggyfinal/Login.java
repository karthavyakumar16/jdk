package swiggyfinal;

public class Login {

    public String localuserName;
    public String localpassWord;

    public  boolean login(String userName, String passWord){
        if(localuserName.equals(userName)&&localpassWord.equals(passWord)){
            System.out.println("login sucessfull");
        }else {
            System.out.println("login fail");
        }
return true;
    }
}
