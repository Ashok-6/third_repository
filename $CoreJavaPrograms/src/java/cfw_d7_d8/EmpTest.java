package java.cfw_d7_d8;

import java.util.TreeSet;

public class EmpTest {

    public static void main(String[] args) {
        // Create the object for TreeSet with EmpNameComparator
        TreeSet al = new TreeSet(new EmpNameComparator());

        Emp em3 = new Emp(103, "Ashok");
        Emp em1 = new Emp(101, "subbu");
        Emp em2 = new Emp(102, "Karthik");

        al.add(em1);
        al.add(em2);
        al.add(em3);

        for (Object emp : al) {
            System.out.println(emp);
        }
    }
}
