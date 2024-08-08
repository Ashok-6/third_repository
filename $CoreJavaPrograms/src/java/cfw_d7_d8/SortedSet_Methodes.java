package java.cfw_d7_d8;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSet_Methodes {
public static void main(String[]args) {
	
	SortedSet ss =new TreeSet();
	ss.add(3);
	ss.add(7);
	ss.add(1);
	ss.add(5);
	ss.add(2);
	ss.add(6);
	
/*The tailSet() method of SortedSet interface in Java is used to return a view of the portion 
	 * of this set whose elements are greater than or equal to the parameter fromElement*/
	
	System.out.println("Tailset=> (Elements >= 2) "+ " = " +ss.tailSet(2));
	
/*The headSet() method of SortedSet interface in Java is used to return
a view of the portion of this set whose elements are strictly less than the parameter toElement.****/
	
	System.out.println("Headset=> (elements < 7)"+ " = " +ss.headSet(7));
	
/*the subSet() method of SortedSet interface in Java is used to return a view of the portion of 
	 this set whose elements range from fromElement, inclusive, to toElement, exclusive.*/	
	
	System.out.println("Subset =>(range between (2,7)):"+" = "+ ss.subSet(2,7));
}
}
