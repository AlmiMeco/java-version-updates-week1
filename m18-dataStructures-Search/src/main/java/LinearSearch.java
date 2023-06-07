public class LinearSearch {

    public boolean linearSearch(int[] array, int data){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) return true;
        }
        return false;

    }

    public int linearSearchReturnInt(int[] array, int data){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) return i;
        }
        return 0;

    }

}
