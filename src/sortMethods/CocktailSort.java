package sortMethods;

public class CocktailSort {
    public CocktailSort() {
    }

    public static void sort(Integer[] A) {
        while(true) {
            boolean swapped = false;

            int i;
            int temp;
            for(i = 0; i <= A.length - 2; ++i) {
                if (A[i] > A[i + 1]) {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped) {
                swapped = false;

                for(i = A.length - 2; i >= 0; --i) {
                    if (A[i] > A[i + 1]) {
                        temp = A[i];
                        A[i] = A[i + 1];
                        A[i + 1] = temp;
                        swapped = true;
                    }
                }

                if (swapped) {
                    continue;
                }
            }

            return;
        }
    }
}