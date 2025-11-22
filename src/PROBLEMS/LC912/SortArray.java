package PROBLEMS.LC912;
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
