package dataStructure.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {3, 8, 4, 7, 1, 8, 2};
        SelectionSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) index = j;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
