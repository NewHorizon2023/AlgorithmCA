package Part1;

import Base.ReadStaffData;
import Base.Staff;

import java.util.Arrays;

/**
 * Question1: bubble sort.
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class BubbleSort {
    /**
     * Bubble sort algorithm for sorting an array of elements of type T.
     *
     * @param arr The array to be sorted.
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {
        // If the subarray has only one element or is empty, no need to sort.
        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int j = arr.length - 1; j > 0; j--) {
            // This flag is used to determine whether the remaining data is in the correct order.
            boolean flag = true;
            for (int i = 0; i < j; i++) {
                // If arr[i] is larger than arr[i+1], exchange their positions.
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }

            // If flag is ture, that means the remaining data is in the correct order, break the loop.
            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Staff[] staffs = ReadStaffData.read(5);
        System.out.println("Before sort:");
        System.out.println(Arrays.toString(staffs));
        System.out.println("------------------------------------------------------");
        sort(staffs);
        System.out.println("After sort:");
        System.out.println(Arrays.toString(staffs));
    }
}
