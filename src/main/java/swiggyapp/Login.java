package swiggyapp;

public class Login {
    public String localuserName;
    public String localpassWord;

    public  String login(String userName, String passWord){
        if(localuserName.equals(userName)&&localpassWord.equals(passWord)){
            return "login sucess";
        }else {
            return "invalid credentails";
        }



    }
}
