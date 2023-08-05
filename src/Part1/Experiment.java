package Part1;

import Base.ReadStaffData;
import Base.Staff;

/**
 * Question3: experiment.
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class Experiment {
    public static void main(String[] args) {
        Staff[] staffs10 = ReadStaffData.read(10);
        Staff[] staffs100 = ReadStaffData.read(100);
        Staff[] staffs1000 = ReadStaffData.read(1000);
        Staff[] staffs5000 = ReadStaffData.read(5000);
        Staff[] staffs10000 = ReadStaffData.read(10000);

        long begin = System.nanoTime();
        BubbleSort.sort(staffs10);
        long end = System.nanoTime();
        System.out.println("The time taken to sort 10 elements with bubble sort is: " + (end - begin) / 1000 + " microseconds");

        begin = System.nanoTime();
        BubbleSort.sort(staffs100);
        end = System.nanoTime();
        System.out.println("The time taken to sort 100 elements with bubble sort is: " + (end - begin) / 1000 + " microseconds");

        begin = System.nanoTime();
        BubbleSort.sort(staffs1000);
        end = System.nanoTime();
        System.out.println("The time taken to sort 1000 elements with bubble sort is: " + (end - begin) / 1000 + " microseconds");

        begin = System.nanoTime();
        BubbleSort.sort(staffs5000);
        end = System.nanoTime();
        System.out.println("The time taken to sort 5000 elements with bubble sort is: " + (end - begin) / 1000 + " microseconds");

        begin = System.nanoTime();
        BubbleSort.sort(staffs10000);
        end = System.nanoTime();
        System.out.println("The time taken to sort 10000 elements with bubble sort is: " + (end - begin) / 1000 + " microseconds");
    }

}
