package Part1;

import java.util.ArrayList;
import java.util.List;

/**
 * Question4-1: Abstract class of binary search.
 *
 * @author Xiangnan Liu
 * @date 2023-08-03 15:01
 */
public abstract class AbstractBinarySearch<T, E> {

    /**
     * Find all occurrences of a target element in a sorted array.
     *
     * @param arr
     * @param target
     * @return
     */
    public List<T> find(T[] arr, E target) {
        int low = 0;
        int high = arr.length - 1;
        List<T> list = new ArrayList<>();

        // Perform binary search to find the target element.
        while (low <= high) {
            int mid = (low + high) / 2;
            T midValue = arr[mid];

            // If the target element is found at the middle index, find all occurrences of the target element.
            if (compareTo(midValue, target) == 0) {
                int i = mid;
                int j = mid;

                // Find all occurrences of the target element on the left side.
                while (compareTo(arr[i], target) == 0) {
                    list.add(arr[i++]);
                }

                // Find all occurrences of the target element on the right side.
                while (compareTo(arr[j], target) == 0) {
                    list.add(arr[j--]);
                }

                return list;
            } else if (compareTo(midValue, target) < 0) {
                // If the target element is greater than the middle element, search on the right side of the array.
                low = mid + 1;
            } else {
                // If the target element is greater than the middle element, search on the left side of the array.
                high = mid - 1;
            }
        }

        return null;
    }

    /**
     * Override this comparing method when extends this abstract class.
     *
     * @param t
     * @param e
     * @return
     */
    public abstract int compareTo(T t, E e);
}
