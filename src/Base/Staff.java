package Base;

/**
 * Staff
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class Staff implements Comparable<Staff> {
    private int empNo;
    private String fName;
    private String sName;
    private String department;
    private float wage;
    private float projectCompletionRate;


    // constructor
    public Staff(int empNo, String fName, String sName, String department, float wage, float projectCompletionRate) {
        super();
        this.empNo = empNo;
        this.fName = fName;
        this.sName = sName;
        this.department = department;
        this.wage = wage;
        this.projectCompletionRate = projectCompletionRate;
    }

    // setters and getters
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getProjectCompletionRate() {
        return projectCompletionRate;
    }

    public void setProjectCompletionRate(float projectCompletionRate) {
        this.projectCompletionRate = projectCompletionRate;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    // so the staff objects can be compared when sorting/searching

    @Override
    public int compareTo(Staff staff) {
        // If these 2 staffs have different fName, compare directly
        if (!fName.equals(staff.getFName())) {
            return fName.compareTo(staff.getFName());
        }

        // If these 2 staffs have same fName, compare there empNo
        return empNo - (staff.getEmpNo());
    }

    public boolean equals(Staff staff) {
        return fName.equals(staff.getFName());
    }

    @Override
    public String toString() {
        return "\n" + "Staff [EmpNo=" + empNo + ", first name=" + fName + ", last Name=" + sName + ", department="
                + department + ", wage=" + wage + ", project completion rate="
                + projectCompletionRate + "]";
    }
}
