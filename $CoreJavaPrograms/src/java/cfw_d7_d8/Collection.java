package java.cfw_d7_d8;
import java.util.ArrayList;
import java.util.List;
/*Collection is called interface in java whereas Collections is called a utility 
 * class in java and both of them can be found in java. util. package. 
 * Collection is used to represent a single unit with a group of individual objects whereas
 * collections is used to operate on collection with several utility methods
 * using arrays, we can store multiple values in a single variable.
	while we are storing the values inside an array, those are stored based 
	on the index 
	index always starts from 0 th locatin.
	AL implements list interface
 * allow duplicates
	*/

public class Collection {
	public static void main(String[] args) {
				 	
		 List list = new ArrayList();
		 
			list.add(Integer.valueOf(43));
			list.add(Boolean.valueOf(false));
			list.add(new String("Ashok"));
			list.add(Character.valueOf('A'));
			list.add(new String("Ashok"));
							
			System.out.print(list);
	}
	

}

