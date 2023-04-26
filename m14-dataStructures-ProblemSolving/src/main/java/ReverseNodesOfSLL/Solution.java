package ReverseNodesOfSLL;

public class Solution {
/** Constraints -> Reverse must be done in one sweep (loop) :: Reverse must be done IN-PLACE **/
    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i < 10; i++) list.add(i);

        list.print();


        /*
        * Original Flow --> { 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null }
        * New Flow      --> { 9 -> 8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> 0 -> null }
        * */

        reverseSLL(list);

        list.print();




    }

    public static void reverseSLL(MySinglyLinkedList list){

        Node prev = list.head;
        Node current = list.head.next;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;

    }

}
