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


    void deleteByID(int id) {
        // check if empty
        if (isEmpty()) System.out.println("List is empty!!!");

        // set current + prev -> as head
        Node prev = head;
        Node current = head;


        while (current != null) {

            if (current.id == id) { // conditional statement (parsing list until desired element (byID) is found)

                /* IF Element deleted is Head   [O(1)]*/
                if (current == head) {   // deleting the head
                    head = current.next; // head == is pushed one spot to the right
                    current.next = null; // the old head pointer is made null (removed)

                /* IF Element deleted is Tail   [O(n)]*/
                } else if (current == tail) {
                    tail = prev;         // tail is moved one spot to the left
                    prev.next = null;    // the old tail pointer is made null (removed)

                /* IF Element deleted is in the Middle [O(n)]*/
                } else {
                    prev.next = current.next;
                    current.next = null;
                }

                size--; // list size decreased by 1 regardless of where it is deleted

            }
            prev = current;
            current = current.next;
        }





    }


}
