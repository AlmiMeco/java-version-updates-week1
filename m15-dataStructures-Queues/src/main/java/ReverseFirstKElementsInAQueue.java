import java.util.Stack;

public class ReverseFirstKElementsInAQueue {

    public static void main(String[] args) {

        int k = 4;

        MyQueue<Integer> integers = new MyQueue<>();

        integers.enqueue(10);
        integers.enqueue(20);
        integers.enqueue(30);
        integers.enqueue(40);
        integers.enqueue(50);

        integers.printQueue();
        reverseFirstKElem(integers, k);
        System.out.println("");
        integers.printQueue();

    }

    public static MyQueue<Integer> reverseFirstKElem(MyQueue<Integer> myQueue, int k) {

        Stack<Integer> integerStack = new Stack<>();

        for (int i = 0; i < k; i++) {
            integerStack.push(myQueue.dequeue());
        }

        while (!integerStack.isEmpty()) {
            myQueue.enqueue(integerStack.pop());
        }

        for (int i = 0; i < myQueue.size() - k; i++) {
            myQueue.enqueue(myQueue.dequeue());
        }

        return myQueue;
    }


}
