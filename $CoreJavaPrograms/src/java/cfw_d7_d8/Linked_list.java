package java.cfw_d7_d8;
import java.util.LinkedList;
import java.util.List;
/**
 * LL implements collection interface
 * allow duplicates
 * 
 * **/
public class Linked_list {
public static void main(String[]args) {
	
	// //create the object for collection (linkedlist)
	List list1=new LinkedList();
	
	list1.add(Integer.valueOf(23));
	list1.add(Boolean.valueOf(false));
	list1.add(new String("Ashok"));
	list1.add(Character.valueOf('A'));
	list1.add(Boolean.valueOf(false));
	
	for(Object k:list1)
	System.out.println(k);
}
}
