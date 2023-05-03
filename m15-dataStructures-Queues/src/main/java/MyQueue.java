import java.util.NoSuchElementException;

public class MyQueue<T> {
    /**
     * CREATING OUR QUEUE STRUCTURE
     **/

    QNode<T> front;
    QNode<T> back;
    int size;

    /**
     * Base Const.
     **/
    public MyQueue() {
    }

    /**
     * isEmpty() method
     **/
    boolean isEmpty() {
        return front == null;
    }

    /**
     * .enqueue() method
     **/
    void enqueue(T item) {
        QNode<T> node = new QNode<>(item);
        if (isEmpty()) front = back = node;
        else {
            back.next = node;
            back = node;
        }
        size++;
    }

    /**
     * .dequeue() method
     **/
    T dequeue() {
        QNode<T> frontNode;
        if (isEmpty()) throw new NoSuchElementException();
        if (front == back) {
            frontNode = front;
            front = back = null;
        } else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.value;
    }

    /**
     * .peek() method
     **/
    T peek() {
        return front.value;
    }

    /**
     * .size() method
     **/
    int size() {
        return size;
    }


}
