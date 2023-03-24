public class App {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();

        System.out.println(myList.isEmpty()); // --> true


        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.print();




    }
}
