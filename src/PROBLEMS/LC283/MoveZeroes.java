package PROBLEMS.LC283;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index] = num;
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("After moving zeroes: " + Arrays.toString(arr));
    }
}

