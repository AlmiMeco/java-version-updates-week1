public class BinarySearch {


    public static int iterativeBinarySearch(int[] array, int data) {

        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == data) return middle;
            if (data < array[middle]) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int data, int left, int right) {

        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (array[middle] == data) return middle;
        if (data < array[middle]) return recursiveBinarySearch(array, data, left, middle - 1);
        else return recursiveBinarySearch(array, data, middle + 1, right);

    }

    public static int recursiveBinarySearch(int[] array, int data) {
        return recursiveBinarySearch(array, data, 0, array.length - 1);
    }


    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        System.out.println(iterativeBinarySearch(numbers, 7));
        System.out.println(recursiveBinarySearch(numbers, 7));

    }
}
