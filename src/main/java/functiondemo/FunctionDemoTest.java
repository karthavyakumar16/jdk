package functiondemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemoTest {

    Function<String,String> toUpperFunc=(fullName)->{
        return fullName.toUpperCase();


    };
    BiFunction<String,String,String> concatFunc=(fristName,lastName)->{
        String fullName=fristName+lastName;
        System.out.println("name"+fullName);
        return fullName;
    };
    BiFunction<String,String,Integer>  lengthofinteger=(name1,name2)->{
        int t1=name1.length();
        int t2=name2.length();
        int t3=t1+t2;
        System.out.println(t3);
        return t3;
    };



    public String concatName(String fristName,String lastName){
        String fullName=fristName+lastName;
        System.out.println("name"+fullName);
        return fullName;
    }
    public static void main(String[] args) {
        FunctionDemoTest functionDemoTest=new FunctionDemoTest();
        functionDemoTest.concatName("neoteric","method");

        functionDemoTest. concatFunc.apply("neoteric","method");

        functionDemoTest. lengthofinteger.apply("neoteric","method");
    }
}
