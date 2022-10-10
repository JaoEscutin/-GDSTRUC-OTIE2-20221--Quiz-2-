package Quiz_2;

import org.w3c.dom.Node;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }


    public void printList(){


        System.out.print("Head -> ");
        PlayerNode current = head;

        while(current != null){
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();

        }
        System.out.println("NULL");

    }


    //public void removeList(Player player){

        //PlayerNode playerNode = new PlayerNode(player);
        //playerNode.setNextPlayer(head);
        //head = playerNode;


   // }





}
