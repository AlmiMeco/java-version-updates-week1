public class TernarySearch {


    public static int iterativeTernarySearch(int[] array, int data){

        int left = 0, right = array.length-1;

        while (right > left){
            int part = (right - left)/3;
            int middle1 = left + part;
            int middle2 = right - part;
            if (array[middle1] == data) return middle1;
            if (array[middle2] == data) return middle2;
            if (data < array[middle1]) right = middle1-1;
            else if (data > array[middle2]) left = middle2+1;
            else {
                left = middle1+1;
                right = middle2-1;
            }
        }
        return -1;
    }

    public static int recursiveTernarySearch(int[] array, int data, int left, int right){
        if (left>right) return -1;
        int partition=(right-left)/3;
        int middle1 = left + partition;
        int middle2 = right - partition;
        if (array[middle1] == data) return middle1;
        if (array[middle2] == data) return middle2;
        if (data<array[middle1]) return recursiveTernarySearch(array,data, left, middle1-1);
        if(data>array[middle2]) return recursiveTernarySearch(array, data, middle2+1, right);
        else return recursiveTernarySearch(array, data, middle1+1, middle2-1);


    }


    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        System.out.println(iterativeTernarySearch(numbers, 7));
        System.out.println(recursiveTernarySearch(numbers, 7, 0, numbers.length-1));
    }

}
