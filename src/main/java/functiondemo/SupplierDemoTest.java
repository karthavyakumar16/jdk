package functiondemo;

import swiggy.Restarent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemoTest {

    Supplier<List<Restarent>> restarentList=()->{
        List<Restarent> list=new ArrayList<>();
        Restarent restarent=new Restarent();
        restarent.name="mehfil";
        list.add(restarent);
        Restarent restarent1=new Restarent();
        restarent1.name="lucky";
        list.add(restarent1);
        return list;
    };
    public List<Restarent> getRestarentList(){
        List<Restarent> list=new ArrayList<>();
        Restarent restarent0=new Restarent();
        restarent0.name="kfc";
        list.add(restarent0);
        Restarent restarent2=new Restarent();
        restarent2.name="mc";
        list.add(restarent2);
        return list;
    }
 Consumer<List<Restarent>>  restarentConsumer=(abc)->{
      abc.stream().forEach(test->{
                  System.out.println("consumer"+test.name);
              }
              );
 };
    public static void main(String[] args) {
        SupplierDemoTest test=new SupplierDemoTest();
        List<Restarent> funcList=test.restarentList.get();
        List<Restarent> methodList=test.getRestarentList();
        System.out.println(funcList);
        System.out.println(methodList);

    }
}
