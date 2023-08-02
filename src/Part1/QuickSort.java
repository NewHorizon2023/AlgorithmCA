package Part1;

import BaseClass.ReadStaffData;
import BaseClass.Staff;

import java.util.Arrays;

/**
 * Part1, question1, QuickSort
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class QuickSort {

    /**
     * Quick sort algorithm for sorting an array of elements of type T.
     *
     * @param arr
     * @param <T>
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {
        // If the subarray has only one element or is empty, no need to sort.
        if (arr == null || arr.length <= 1) {
            return;
        }

        sort(arr, 0, arr.length - 1);
    }

    /**
     * Quick sort algorithm for sorting an array of elements of type T.
     *
     * @param arr   The array to be sorted.
     * @param begin The starting index of the array or subarray to be sorted.
     * @param end   The ending index of the array or subarray to be sorted.
     */
    private static <T extends Comparable<T>> void sort(T[] arr, int begin, int end) {
        // If begin equals end, finish.
        if (begin >= end) {
            return;
        }

        // Select the pivot element (the first element) as the key for partitioning.
        T key = arr[begin];
        int i = begin;
        int j = end;

        // Partitioning the subarray using the pivot key.
        while (i < j) {
            // Move j towards the left until an element less than or equal to the key is found.
            while (i < j && arr[j].compareTo(key) > 0) {
                j--;
            }
            // Swap the found element with the element at position i, and move i towards the right.
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }

            // Move i towards the right until an element greater than or equal to the key is found.
            while (i < j && arr[i].compareTo(key) < 0) {
                i++;
            }
            // Swap the found element with the element at position j, and move j towards the left.
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }

        // Put the pivot key in its correct position (i) in the sorted subarray.
        arr[i] = key;

        // Recursively sort the left and right subarray.
        sort(arr, begin, i - 1);
        sort(arr, i + 1, end);
    }

    public static void main(String[] args) {
        Staff[] staffs = ReadStaffData.read(20);
        sort(staffs);
        System.out.println(Arrays.toString(staffs));
    }

}
