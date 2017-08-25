package sortingAlgo;

public class bubbleSorting {

    public static void main(String[] args) {

        int[] array = {3, 1, 4, 9, 8, 0};

        bubbleSort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }
        public static int[] bubbleSort ( int[] array){
            int[] list = array;
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length - 1; j++) {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[i] = array[i];

                    }
                }

            }
            return list;
        }

    }

