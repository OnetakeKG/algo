import java.util.Arrays;
import java.util.Random;

public class FirstTry {
    int[] Arr = new int[100];

    //Написать методы удаления, добавления, поиска элемента массива.
    //delete
    public static void delete(int[] array, int index) {
        int[] newArray = new int[array.length - 1];

        for (int i = 0, k = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }

            newArray[k++] = array[i];

        }

    }


    //add
    public static void add(int[] array, int value) {

        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;

    }

    //find
    public static int find(int[] array, int value) {
        int temp = 0;
        for (int i = 0;  i < array.length; i++) {
            if (array[i] == value) {
                temp = i;
                break;
            }

        }
        return temp;
    }




    public static void bubbleSort(Integer[] arr) {
        int limit = arr.length;

        boolean isChange;
        do {
            isChange = false;
            --limit;

            for(int i = 0; i < limit; ++i) {
                if (arr[i] > arr[i + 1]) {
                    Integer temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isChange = true;
                }
            }
        } while(isChange);

    }

    public static void cocktailSort(Integer[] A) {
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

    public static void selectionSort(Integer[] arr) {
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

    public static void fillIt (Object[] arr){
        final Random random = new Random();
        String brands[]={"Lenuvo","Asos","MacNote","Eser","Xamiou",};
        int random_number = (random.nextInt(40)+9)*50;
        if (random_number>2000) random_number -= 450;
        int random_number2 = (random.nextInt(6)*4);
        if (random_number2==0) random_number2 +=4;
        arr [0] = random_number;
        arr [1] = random_number2;
        arr[2] = brands[random.nextInt(5)];
    };
}
