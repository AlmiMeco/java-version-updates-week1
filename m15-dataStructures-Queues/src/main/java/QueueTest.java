import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueTest {

    public static void main(String[] args) {


        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        System.out.println("Size of Queue -> " + myQueue.size);    // size -> 5
        System.out.println("Front of Queue -> " + myQueue.peek()); // front-> 1









    }


}
