import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public void insert(int val){

        if (size == items.length) throw new NoSuchElementException();
        else {
            items[size++] = val;
            bubbleUp();
        }
    }

    public int peek() {
        if (size==0) throw new NoSuchElementException();
        return items[0];
    }

    public void bubbleUp(){
        int index = size-1;

        while (index > 0 && items[index] > items[parentIndex(index)]){
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    public int remove(){
        if (size == 0) throw new NoSuchElementException();
        else {
            int result = items[0];
            items[0] = items[size-1];
            size--;
            bubbleDown();
            return result;
        }
    }

    public void bubbleDown(){
        int index = 0;
        int largerChildIndex;
        while (index <= size && isValidParent(index)){
            largerChildIndex=largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + ", " );
        }
        System.out.println();
    }

    public int leftChildIndex(int index){return index*2+1;}
    public int rightChildIndex(int index){return index*2+2;}
    public int parentIndex(int index){return (index -1)/2;}
    public boolean hasLeftChild(int index){return leftChildIndex(index)<size;}
    public boolean hasRightChild(int index){return rightChildIndex(index)<size;}


    public int largerChildIndex(int index){

        if (!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)) return leftChildIndex(index);
        else {
            if (items[leftChildIndex(index)] > items[rightChildIndex(index)]) return leftChildIndex(index);
            else return rightChildIndex(index);
        }
    }

    public void swap(int first, int second){

        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public boolean isValidParent(int index){

        if (!hasLeftChild(index)) return true;
        else {
            boolean isValid = items[index] > items[leftChildIndex(index)];
            if (hasRightChild(index)) {
                isValid = items[index] >= items[rightChildIndex(index)];
            }
            return isValid;
        }
    }

}
