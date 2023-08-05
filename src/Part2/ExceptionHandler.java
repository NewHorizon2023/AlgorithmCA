package Part2;

import Base.Staff;

/**
 * Question2: exception handler.
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class ExceptionHandler {

    /**
     * Check the fName of staff
     *
     * @param staff
     */
    public static void check(Staff staff) {
        String fName = staff.getFName();

        // If the value of fName is null or empty.
        if (fName == null || fName.isEmpty()) {
            throw new ParamException("The value of fName can't be null or empty!");
        }

        // If the value of fName is a pure number.
        if (fName.matches("\\d+")) {
            throw new ParamException("The value of fName cannot be a pure number!");
        }
    }

    public static void main(String[] args) {
        Staff staff1 = new Staff(1, "", "Hood", "Sales", 1003.77f, 56.3434f);
        Staff staff2 = new Staff(1, "123", "Hood", "Sales", 1003.77f, 56.3434f);
        try {
            check(staff1);
        } catch (ParamException e) {
            System.out.println(e);
        }
        try {
            check(staff2);
        } catch (ParamException e) {
            System.out.println(e);
        }

    }
}
