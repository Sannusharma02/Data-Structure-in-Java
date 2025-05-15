package dataStructure.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >-1 && a[j] > key) {
                a[j+1] = a[j];
                 j--;
            }
            a[j+1] = key;
        }
    }
}
