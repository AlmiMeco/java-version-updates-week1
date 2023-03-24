public class MySinglyLinkedList {


    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int value) {

        Node node = new Node(value); // create new obj (Node) from data

        if (isEmpty()) { // if list is empty
            head = tail = node;
            size++;

        } else {          // if list is NOT empty
            tail.next = node;
            tail = node;
            size++;

        }

    }

    void print() {
        Node current = head;
        while (current != null) {

            if (current.next == null) System.out.println(current.id + " -> null");

            System.out.println(current.id + " -> ");
            current = current.next;
        }
    }


}
