package Part1;

import BaseClass.ReadStaffData;
import BaseClass.Staff;

import java.util.ArrayList;
import java.util.List;

/**
 * BinarySearch
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class BinarySearch {

    /**
     * Find all occurrences of a target element in a sorted array.
     *
     * @param arr
     * @param target
     * @return
     */
    public static List<Staff> find(Staff[] arr, String target) {
        int low = 0;
        int high = arr.length - 1;
        List<Staff> list = new ArrayList<>();

        // Perform binary search to find the target element.
        while (low <= high) {
            int mid = (low + high) / 2;
            Staff midValue = arr[mid];

            // If the target element is found at the middle index, find all occurrences of the target element.
            if (midValue.getFName().equals(target)) {
                int i = mid;
                int j = mid;

                // Find all occurrences of the target element on the left side.
                while (arr[i].getFName().equals(target)) {
                    list.add(arr[i++]);
                }

                // Find all occurrences of the target element on the right side.
                while (arr[j].getFName().equals(target)) {
                    list.add(arr[j--]);
                }

                return list;
            } else if (midValue.getFName().compareTo(target) < 0) {
                // If the target element is greater than the middle element, search on the right side of the array.
                low = mid + 1;
            } else {
                // If the target element is greater than the middle element, search on the left side of the array.
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Staff[] staffs = ReadStaffData.read(10000);
        QuickSort.sort(staffs);
        System.out.println(BinarySearch.find(staffs, "Pamela"));
    }
}
