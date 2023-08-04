package Part2;

import Base.ReadStaffData;
import Base.Staff;

import java.util.List;

/**
 * Question1: add a new record.
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class AddNewRecord {

    /**
     * Add a new staff to the origin list.
     *
     * @param list
     * @param fName
     * @param sName
     * @param department
     * @param wage
     * @param projectCompletionRate
     */
    public static void add(List<Staff> list, String fName, String sName, String department, float wage, float projectCompletionRate) {
        int empNo = list.get(list.size() - 1).getEmpNo() + 1;
        Staff staff = new Staff(empNo, fName, sName, department, wage, projectCompletionRate);
        ExceptionHandler.check(staff);
        list.add(staff);
    }

    public static void main(String[] args) {
        List<Staff> list = ReadStaffData.readAll();
        add(list, "Francis", "Hood", "Sales", 1003.77f, 56.3434f);
        System.out.println(list);
        System.out.println("After been added one staff, the size of new list is: " + list.size());
    }
}
