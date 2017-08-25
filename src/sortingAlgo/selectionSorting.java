package sortingAlgo;

public class selectionSorting {

    public static void main(String[] args) {

        int[] array = {3, 1, 4, 9, 8, 0};

        selectionSort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static int[] selectionSort(int[] array) {
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
        }

        return list;
    }
}

