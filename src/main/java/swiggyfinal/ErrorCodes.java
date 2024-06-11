package swiggyfinal;

public enum ErrorCodes {

DISH_NOT_FOUND("1001","Dish Not Found");
    private String code;
    private String message;

    ErrorCodes(String code,String message){
        this.code=code;
        this.message=message;

    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
