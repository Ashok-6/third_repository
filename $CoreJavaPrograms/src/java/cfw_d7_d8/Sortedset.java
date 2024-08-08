package java.cfw_d7_d8;

import java.util.SortedSet;
import java.util.TreeSet;
/**
 * Sortedset used to store elements with ascending order...
 * it is implements from treeset
 * only homogenious elements*/
public class Sortedset {
	public static void main(String[]args) {
		
		// SortedSet implementation by TreeSet class
		SortedSet s2 = new TreeSet();	
	//add the integer object to  collection s2
	 s2.add((63));
     s2.add((42));
     s2.add((99));
     s2.add((21));
     s2.add((84));
     
     System.out.println(s2);
 
}
}