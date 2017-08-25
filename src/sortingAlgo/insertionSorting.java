package sortingAlgo;

public class insertionSorting {


    public static void main(String[] args) {

        int[] array = {3, 1, 4, 9, 8, 0};

        insertionSort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static int[] insertionSort(int[] array) {
        int[] list = array;


        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }

        }
        return list;
    }

}
