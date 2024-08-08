package java.cfw_d7_d8;

import java.util.LinkedHashSet;
import java.util.Set;
/*support homo and hetoro..elements
 * duplicates not possible
 * insertion order is posiblle**/
public class LinkedHash_set {

	public static void main(String[]args) {
		Set s2=new LinkedHashSet();
		
		
		//add the integer object to  collection s2
		s2.add(Integer.valueOf(63));
		s2.add(null);
		
		s2.add(new String("Hiii"));
		s2.add(null);
		s2.add(new String("Hiii"));
		s2.add(Character.valueOf('S'));
		
		System.out.println(s2);
		System.out.println(" ");
		
		for(Object lhs:s2) {
			System.out.println(lhs);
		}
	}

	
}
