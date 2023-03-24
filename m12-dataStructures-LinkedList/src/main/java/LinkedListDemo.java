import java.util.ArrayList;

public class LinkedListDemo {


    public static void main(String[] args) {


        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);


        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        System.out.println("Node 1 address -> " + node1 + " || Node 1' next address -> " + node1.next);
        System.out.println("Node 2 address -> " + node2 + " || Node 2' next address -> " + node2.next);
        System.out.println("Node 3 address -> " + node3 + " || Node 3' next address -> " + node3.next);
        System.out.println("Node 4 address -> " + node4 + " || Node 4' next address -> " + node4.next);

//======================================================================================================================
//======================================================================================================================

                                /* How can we create LinkedLists manually? */

        Node current;
        Node head = node1;
        current=head;

        while (current != null) {
            System.out.println("ID of Node is -> " + current.id);
            current=current.next;
        }


        ArrayList<Node> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(node1);
        nodeArrayList.add(node2);
        nodeArrayList.add(node3);
        System.out.println(nodeArrayList);

    }

}
