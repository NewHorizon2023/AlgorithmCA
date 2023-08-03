package Part1;

import Base.ReadStaffData;
import Base.Staff;

/**
 * Question4-2: binary search.
 * In this class, a Template Method Design Pattern is used.
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class BinarySearch extends AbstractBinarySearch<Staff, String> {

    @Override
    public int compareTo(Staff staff, String target) {
        return staff.getFName().compareTo(target);
    }

    public static void main(String[] args) {
        Staff[] staffs = ReadStaffData.read(10000);
        QuickSort.sort(staffs);
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.find(staffs, "Pamela"));
    }
}
