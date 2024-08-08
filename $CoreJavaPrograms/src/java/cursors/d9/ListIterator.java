package java.cursors.d9;
import java.util.ArrayList;
//import java.util.ArrayList;
/* we can apply this ListIterator only on top of list realated
 
implementation classes
like Arraylist, vector ,linkedlist, stack. */
import java.util.Stack;
public class ListIterator {
public static void main(String[] args) {	
	
		ArrayList<Integer> al = new ArrayList<Integer>();	//objectlist
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}	
		java.util.ListIterator<Integer> ltr = al.listIterator();	//iteration
		
		System.out.println("retrieving the elements in forward direction");
		
		while(ltr.hasNext()) //1  2 3 ..10
		{
			System.out.println(ltr.next()); //print
		}	
	System.out.println("retreiving the elements in backward direction ");
		while(ltr.hasPrevious()) //10 9 8....1
		{
			System.out.println(ltr.previous());		
		}

		Stack<Integer> stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		
		java.util.ListIterator<Integer> ltr1 = stk.listIterator();
		
		System.out.println();
		System.out.println(" Stack forward direction ==");
		while(ltr1.hasNext()) {
			System.out.println( "Stack next=> " +ltr1.next());
		}
		System.out.println(" Stack reverse direction ==");
		while(ltr1.hasPrevious()) {
			System.out.println( "Stack previos=> " +ltr1.previous());
		}
}
}