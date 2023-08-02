package BaseClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * BaseClass.ReadStaffData
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-02
 */
public class ReadStaffData {

    /**
     * Read data from CVS file
     *
     * @param quantity
     * @return
     */
    public static Staff[] read(int quantity) {
        File directory = new File("src/");
        String name = directory.getAbsolutePath() + "/Staff.csv";
        Scanner sc;
        try {
            sc = new Scanner(new File(name));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Staff[] staffs = new Staff[quantity];

        // this will just print the header in CSV file
        sc.nextLine();

        for (int i = 0; i < Math.min(quantity, 10000); i++) {
            String st = sc.nextLine();
            String[] data = st.split(",");
            staffs[i] = new Staff(Integer.parseInt(data[0]), data[1], data[2], data[3], Float.parseFloat(data[4]), Float.parseFloat(data[5]));
        }

        sc.close();

        return staffs;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(read(10)));
    }

}
