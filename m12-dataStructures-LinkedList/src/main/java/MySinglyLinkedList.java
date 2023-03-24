public class MySinglyLinkedList {


    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

//    |0(1) Time Complexity :: because insertion is done @end (tail)|
    void add(int value) {

        Node node = new Node(value); // create new obj (Node) from data

        // if list is empty
        if (isEmpty()) {
            head = tail = node; // head + tail are assigned to node (original Node created)
            size++;

        // if list is NOT empty
        } else {
            tail.next = node; // tail reference value (tail.next) is assigned to newNODE
            tail = node;      // newNode is assigned as 'tail'
            size++;

        }

    }

    void print() {
        Node current = head;
        while (current != null) { // while list is NOT empty

            if (current.next == null) System.out.println(current.id + " -> null"); // if next reference (.next) == null

            else {
                System.out.print(current.id + " -> "); // print the current id (Node)
            }
            current = current.next; // ea iteration/loop the head(current) is replaced by the next Node
        }
    }


}
