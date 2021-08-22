// import java.util.Arrays;

// public class bubble {

// public static void main(String[] args) {
// int[] arr = { 3, 1, 5, 4, 2 };
// bubble(arr);
// System.out.println(Arrays.toString(arr));
// }

// static void bubble(int[] arr) {
// boolean swapped;
// // run the steps n-1 times
// for (int i = 0; i < arr.length; i++) {
// swapped = false;
// // for each step, max item will come at the last respective index
// for (int j = 1; j < arr.length - i; j++) {
// // swap if the item is smaller than the previous item
// if (arr[j] < arr[j - 1]) {
// // swap
// int temp = arr[j];
// arr[j] = arr[j - 1];
// arr[j - 1] = temp;
// swapped = true;
// }
// }
// // if you did not swap for a particular value of i, it means the array is
// sorted
// // hence stop the program
// if (!swapped) { // !false = true
// break;
// }
// }
// }
// }

public class BubbleSortExample {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);// sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}