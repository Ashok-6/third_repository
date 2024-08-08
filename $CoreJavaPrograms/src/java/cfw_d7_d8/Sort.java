package java.cfw_d7_d8;

import java.util.SortedSet;

import java.util.TreeSet;
public class Sort {
public static void main(String[]args) {
	
	SortedSet s2 = new TreeSet();
	Emp e1=new Emp(100, "Ashok");
	Emp e2=new Emp(200, "Giri");
	Emp e3=new Emp(300, "Kumar");
	
	s2.add(e1);
	s2.add(e2);
	s2.add(e3);
	
	for(Object o:s2) {
		Emp ee = (Emp)o;
		System.out.println( ee.getEmp_id()+" " +ee.getEmp_name());
		
	}
}
} 
