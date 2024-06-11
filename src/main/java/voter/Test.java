package voter;

import predicate.Ticket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Voter voter1=new Voter();
        voter1.voterId="1234";
        voter1.status="yes";
        Voter voter2=new Voter();
        voter2.voterId="1234";
        voter2.status="yes";
        Voter voter3=new Voter();
        voter3.voterId="1234";
        voter3.status="no";
        Voter voter4=new Voter();
        voter4.voterId="1234";
        voter4.status="no";
        Voter voter5=new Voter();
        voter5.voterId="1234";
        voter5.status="yes";

        List<Voter> voterList=new ArrayList<>();
        voterList.add(voter1);
        voterList.add(voter2);
        voterList.add(voter3);
        voterList.add(voter4);
        voterList.add(voter5);

        Predicate<Voter> voterPredicate = (voter) ->
                voter.status.equals("yes");

        Iterator<Voter> iterator = voterList.iterator();
        for (; iterator.hasNext(); ) {
            Voter voter = iterator.next();
            if (voter.status.equals("no")) {
                System.out.println("you can cast your vote");

            }else{
                System.out.println("you have already casted your vote");
            }
        }

    }
}
