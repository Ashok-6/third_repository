package java.collection.lamda.d9;

import java.util.TreeSet;

public class Emp_main {

	

	public static void main(String[] args) {
		//int compare(T o1, T o2);
		TreeSet<Emp> ts = new TreeSet<Emp>((x,y)-> y.getEmid().compareTo(x.getEmid()));
	
		Emp e1 = new Emp(111,"Ashok");
		Emp e2 = new Emp(222,"karthik");	
		Emp e3 = new Emp(333,"subbu");
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		System.out.println(ts);
}}
