package restarentlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Restarent> restarentList = new ArrayList<>();
        Restarent restarent = new Restarent();
        restarent.name = "lucky";
        restarent.location = "green hills";
        restarent.rating = "3.5";

        Restarent restarent1 = new Restarent();
        restarent1.name = "mefhil";
        restarent1.location = "hitechcity";
        restarent1.rating = "4.5";

        Restarent restarent2 = new Restarent();
        restarent2.name = "shahgouse";
        restarent2.location = "kphb ";
        restarent2.rating = "5.5";
        restarentList.add(restarent);
        restarentList.add(restarent1);
        restarentList.add(restarent2);


        for (int i = 0; i < restarentList.size(); i++) {
            Restarent restarent3 = restarentList.get(i);
            System.out.println(restarent3.name);
        }

        Iterator<Restarent>iterator=restarentList.iterator();
        for(;iterator.hasNext();){
            Restarent restarent3=iterator.next();
            System.out.println(restarent3 .name);
        }
        restarentList.forEach(restarent3 -> {
            System.out.println("consumer"+restarent3.name);
        });

    }
    }
