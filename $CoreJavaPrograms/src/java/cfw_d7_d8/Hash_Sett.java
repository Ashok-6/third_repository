package java.cfw_d7_d8;

import java.util.HashSet;
	import java.util.Set;
public class Hash_Sett {
	
	
	/*/*support homo and hetoro...elements
	 * duplicates not allowed
	 * insertion order not posible*/
	public static void main(String[]args) {
		
		Set s1=new HashSet();
		
		s1.add(Integer.valueOf(88));
		s1.add(new String("ashokkumar"));
		s1.add(null);
		s1.add(new String("ashokkumar"));
		s1.add(Character.valueOf('A'));
		
		for(Object hs1:s1) {
			System.out.println(hs1);
		
	}}
		

}
