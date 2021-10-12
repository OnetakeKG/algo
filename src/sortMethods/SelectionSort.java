package sortMethods;

public class SelectionSort {
    public SelectionSort() {
    }

    public static void sort(Integer[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            int min = i;

            int temp;
            for(temp = i + 1; temp < arr.length; ++temp) {
                if (arr[temp] < arr[min]) {
                    min = temp;
                }
            }

            if (i != min) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

    }
}