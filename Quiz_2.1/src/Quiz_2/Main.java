package Quiz_2;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String>playerList=new LinkedList<>();

        playerList.add(String.valueOf(new Player(30,"Vader",10)));
        playerList.add(String.valueOf(new Player(60,"Jayce",12)));
        playerList.add(String.valueOf(new Player(90,"Jinx",15)));
        playerList.add(String.valueOf(new Player(120,"Zac",18)));
        playerList.add(String.valueOf(new Player(150,"Ez",20)));


        System.out.println("Linked List Before Removing");

        for(String p : playerList)
        {
            System.out.println(p);

        }




        // Remove Function
        playerList.remove(0);
        System.out.println("\nRemove First Element..\n");

        for(String p : playerList)
        {
            System.out.println(p);

        }

        //Contain Function
       System.out.println("\nContain Function..\n");
        System.out.println(playerList.contains(new Player(30,"Vader",10)));

        //Get Index
       System.out.println("\nIndex Function..\n");
       System.out.println(playerList.indexOf(new Player(30,"Vader",10)));



    }
}